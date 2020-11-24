package SE.project.SangusaaBank.data;

import SE.project.SangusaaBank.model.Credit;
import SE.project.SangusaaBank.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerRepository {

    private JdbcTemplate jdbcTemplate;

    public CustomerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> findAll() {
        String query = "SELECT * FROM data.customer";
        List<Customer> customers =
                jdbcTemplate.query(query, new CustomerMapper());
        return customers;
    }

    public Customer findById(String id) {
        String query = "SELECT * FROM data.customer WHERE id = " +"'"+ id + "'";
        Customer customer = jdbcTemplate.queryForObject(query, new CustomerMapper());
        return customer;
    }

    public void save(Customer customer) {
        String query = "INSERT INTO data.customer (id, FirstName, LastName, password, date, Status) VALUES (?,?,?,?,?,?);";
        Object[] data = new Object[]
                { customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getPassword(), customer.getDate(), customer.getStatus()};
        jdbcTemplate.update(query, data);
    }

    public void store(Customer customer) {
        String Sql = "UPDATE data.customer SET password="+ customer.getPassword() + " where id=" + customer.getId() + ";";
        jdbcTemplate.update(Sql);
    }

    public void deleteById(String id) {
        String query = "DELETE FROM customer WHERE username = " + id;
        jdbcTemplate.update(query);
    }

    class CustomerMapper implements RowMapper<Customer> {

        @Override
        public Customer mapRow(ResultSet resultSet, int i)
                throws SQLException {
            String id = resultSet.getString("id");
            String FirstName = resultSet.getString("FirstName");
            String LastName = resultSet.getString("LastName");
            String password = resultSet.getString("password");
            String date = resultSet.getString("date");
            String status = resultSet.getString("Status");
            Customer customer = new Customer(id, FirstName, LastName ,password, date, status);
            return customer;
        }
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