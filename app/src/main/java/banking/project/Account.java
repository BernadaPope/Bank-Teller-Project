package banking.project;

public class Account {
    private String accountNumber;
    private String accountType;
    private Double accountBalance;
    public Account() {}
    public Account(String accountNumber, String accountType, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public Double getAccountBalance() {
        return accountBalance;
    }
    public Double sum(Double accountBalance, Double depositAmount) {
        return accountBalance + depositAmount;
    }
    public Double subtract(Double accountBalance, Double withdrawalAmount) {
        return accountBalance - withdrawalAmount;
    }
}

