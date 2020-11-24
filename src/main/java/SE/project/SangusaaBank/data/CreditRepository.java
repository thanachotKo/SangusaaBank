package SE.project.SangusaaBank.data;

import SE.project.SangusaaBank.model.Credit;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CreditRepository {

    private JdbcTemplate jdbcTemplate;

    public CreditRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Credit> findAll(){
        String query = "SELECT * FROM data.personal," + "data.career," + "data.credit";
        List<Credit> credits = jdbcTemplate.query(query, new CreditRepository.CreditMapper());
        return credits;
    }

    public Credit findById (String id){
        String query = "SELECT * FROM data WHERE id = " + id;
        Credit credit = jdbcTemplate.queryForObject(query, new CreditRepository.CreditMapper());
        return credit;
    }

    public void savePersonal (Credit credit) {
        String query = "INSERT INTO data.personal (id, FirstName, LastName, PhoneNumber, Email, CompanyName) VALUES (?,?,?,?,?,?);";
        Object[] data = new Object[]
                {credit.getId(), credit.getFirstName(), credit.getLastName(), credit.getPhoneNumber(), credit.getEmail(),
                        credit.getCompanyName()};
        jdbcTemplate.update(query, data);
    }

    public void saveCredit (Credit credit) {
        String query = "INSERT INTO data.credit (Creditid, MoneyYouWant, TimeToPayBack, IncomePerMonth) VALUES (?,?,?,?);";
        Object[] data = new Object[]
                {credit.getCreditId(), credit.getMoneyYouWant(), credit.getTimeToPayBack(), credit.getIncomePerMonth()};
        jdbcTemplate.update(query, data);
    }

    public void saveCareer (Credit credit) {
        String query = "INSERT INTO data.career (CareerId, Creditid, CareerName, CompanyName, CompanyLocation, CompanyPhoneNumber, AllTimeInCompany, PictureSalaryStatement, PictureBeForeSixMonth) VALUES (?,?,?,?,?,?,?,?,?);";
        Object[] data = new Object[]
                {credit.getCareerId(), credit.getCreditId(), credit.getCareerName(), credit.getCompanyName(), credit.getCompanyLocation(),
                credit.getCompanyPhoneNumber(), credit.getAllTimeInCompany(), credit.getPictureSalaryStatement(), credit.getPictureBeforeSixMonth()};
        jdbcTemplate.update(query, data);
    }

    public void deletedById (int id){
        String query = "DELETE FROM data WHERE id = " + id;
        jdbcTemplate.update(query);
    }

    class CreditMapper implements RowMapper<Credit> {

        @Override
        public Credit mapRow(ResultSet resultSet, int i) throws SQLException {
            String id = resultSet.getString("id");
            String firstName = resultSet.getString("FirstName");
            String lastName = resultSet.getString("LastName");
            String phoneNumber = resultSet.getString("PhoneNumber");
            String email = resultSet.getString("Email");
            String career = resultSet.getString("CareerName");
            float incomePerMonth = resultSet.getFloat("IncomePerMonth");
            String companyName = resultSet.getString("CompanyName");
            String companyLocation = resultSet.getString("CompanyLocation");
            String companyPhoneNumber = resultSet.getString("CompanyPhoneNumber");
            String allTimeInCompany = resultSet.getString("AllTimeInCompany");
            float moneyYouWant = resultSet.getFloat("MoneyYouWant");
            String timeToPayBack = resultSet.getString("TimeToPayBack");
            String pictureSalaryStatement = resultSet.getString("PictureSalaryStatement");
            String pictureBeforeSixMonth = resultSet.getString("PictureBeforeSixMonth");
            String creditId = resultSet.getString("CreditId");
            String careerId = resultSet.getString("CareerId");

            return  new Credit(id, firstName, lastName, phoneNumber, email, career, incomePerMonth, companyName, companyLocation,
                    companyPhoneNumber, allTimeInCompany, moneyYouWant, timeToPayBack, pictureSalaryStatement, pictureBeforeSixMonth, creditId, careerId);
        }
    }

}
