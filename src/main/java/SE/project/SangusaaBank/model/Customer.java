package SE.project.SangusaaBank.model;

public class Customer {

    private String id;
    private String FirstName;
    private String LastName;
    private String password;
    private String date;
    private String Status;

    public Customer(String id, String firstName, String lastName, String password, String date, String status) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.password = password;
        this.date = date;
        Status = "รอการตรวจสอบ";
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPassword() {
        return password;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return Status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        Status = status;
    }

}
