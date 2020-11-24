package SE.project.SangusaaBank.model;

public class RegisterForStudyAndNursing {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String career;
    private float incomePerMonth;
    private String companyName;
    private String companyLocation;
    private String companyPhoneNumber;
    private String allTimeInCompany;
    private float moneyYouWant;
    private String timeToPayBack;
    private String pictureIncomePerMonth;
    private String pictureBeforeSixMonth;
    private String pictureTab;
    private String pictureReport;

    public RegisterForStudyAndNursing(String id, String firstName, String lastName, String phoneNumber, String email, String career, float incomePerMonth, String companyName, String companyLocation, String companyPhoneNumber, String allTimeInCompany, float moneyYouWant, String timeToPayBack, String pictureIncomePerMonth, String pictureBeforeSixMonth, String pictureTab, String pictureReport) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.career = career;
        this.incomePerMonth = incomePerMonth;
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.companyPhoneNumber = companyPhoneNumber;
        this.allTimeInCompany = allTimeInCompany;
        this.moneyYouWant = moneyYouWant;
        this.timeToPayBack = timeToPayBack;
        this.pictureIncomePerMonth = pictureIncomePerMonth;
        this.pictureBeforeSixMonth = pictureBeforeSixMonth;
        this.pictureTab = pictureTab;
        this.pictureReport = pictureReport;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCareer() {
        return career;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public String getAllTimeInCompany() {
        return allTimeInCompany;
    }

    public float getIncomePerMonth() {
        return incomePerMonth;
    }

    public float getMoneyYouWant() {
        return moneyYouWant;
    }

    public String getTimeToPayBack() {
        return timeToPayBack;
    }

    public String getPictureIncomePerMonth() {
        return pictureIncomePerMonth;
    }

    public String getPictureBeforeSixMonth() {
        return pictureBeforeSixMonth;
    }

    public String getPictureTab() {
        return pictureTab;
    }

    public String getPictureReport() {
        return pictureReport;
    }

    public void setId(String id) {
        this.id = id;
    }
}
