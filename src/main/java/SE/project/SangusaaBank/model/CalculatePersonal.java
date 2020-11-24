package SE.project.SangusaaBank.model;

public class CalculatePersonal {
    private String type;
    private String incomePerMonth;
    private String moneyYourWant;
    private String timeToPayBack;
    private String result;

    public CalculatePersonal(String type, String incomePerMonth, String moneyYourWant, String timeToPayBack) {
        this.type = type;
        this.incomePerMonth = incomePerMonth;
        this.moneyYourWant = moneyYourWant;
        this.timeToPayBack = timeToPayBack;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setTimeToPayBack(String timeToPayBack) {
        this.timeToPayBack = timeToPayBack;
    }

    public String getTimeToPayBack() {
        return timeToPayBack;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIncomePerMonth(String incomePerMonth) {
        this.incomePerMonth = incomePerMonth;
    }

    public void setMoneyYourWant(String moneyYourWant) {
        this.moneyYourWant = moneyYourWant;
    }

    public String getType() {
        return type;
    }

    public String getIncomePerMonth() {
        return incomePerMonth;
    }

    public String getMoneyYourWant() {
        return moneyYourWant;
    }
}
