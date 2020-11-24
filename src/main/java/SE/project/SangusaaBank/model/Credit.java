package SE.project.SangusaaBank.model;

public class Credit {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String careerName;
    private float incomePerMonth;
    private String companyName;
    private String companyLocation;
    private String companyPhoneNumber;
    private String allTimeInCompany;
    private float moneyYouWant;
    private String timeToPayBack;
    private String pictureSalaryStatement;
    private String pictureBeforeSixMonth;
    private String creditId;
    private String careerId;

    public Credit(String id, String firstName, String lastName, String phoneNumber, String email, String careerName, float incomePerMonth, String companyName, String companyLocation, String companyPhoneNumber, String allTimeInCompany, float moneyYouWant, String timeToPayBack, String pictureSalaryStatement, String pictureBeforeSixMonth, String creditId, String careerId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.careerName = careerName;
        this.incomePerMonth = incomePerMonth;
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.companyPhoneNumber = companyPhoneNumber;
        this.allTimeInCompany = allTimeInCompany;
        this.moneyYouWant = moneyYouWant;
        this.timeToPayBack = timeToPayBack;
        this.pictureSalaryStatement = pictureSalaryStatement;
        this.pictureBeforeSixMonth = pictureBeforeSixMonth;
        this.creditId = "";
        this.careerId = "";
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

    public String getCareerName() {
        return careerName;
    }

    public float getIncomePerMonth() {
        return incomePerMonth;
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

    public float getMoneyYouWant() {
        return moneyYouWant;
    }

    public String getTimeToPayBack() {
        return timeToPayBack;
    }

    public String getPictureSalaryStatement() {
        return pictureSalaryStatement;
    }

    public String getPictureBeforeSixMonth() {
        return pictureBeforeSixMonth;
    }

    public String getCreditId() {
        return creditId;
    }

    public String getCareerId() {
        return careerId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    public void setIncomePerMonth(float incomePerMonth) {
        this.incomePerMonth = incomePerMonth;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public void setAllTimeInCompany(String allTimeInCompany) {
        this.allTimeInCompany = allTimeInCompany;
    }

    public void setMoneyYouWant(float moneyYouWant) {
        this.moneyYouWant = moneyYouWant;
    }

    public void setTimeToPayBack(String timeToPayBack) {
        this.timeToPayBack = timeToPayBack;
    }

    public void setPictureSalaryStatement(String pictureSalaryStatement) {
        this.pictureSalaryStatement = pictureSalaryStatement;
    }

    public void setPictureBeforeSixMonth(String pictureBeforeSixMonth) {
        this.pictureBeforeSixMonth = pictureBeforeSixMonth;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public void setCareerId(String careerId) {
        this.careerId = careerId;
    }

}
