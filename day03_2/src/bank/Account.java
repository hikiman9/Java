package bank;

public class Account {
    private String accNum;
    private String custNum;
    private long balance;
    private double interest;

    public Account() {
    }

    public Account(String accNum, String custNum, long balance, double interest) {
        this.accNum = accNum;
        this.custNum = custNum;
        this.balance = balance;
        this.interest = interest;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustNum() {
        return custNum;
    }

    public long getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void withdraw(long money) {
        this.balance -= money;
    }

    public void deposit(long money) {
        this.balance += money;
    }

    public double getCalInterest() {
        return this.balance * this.interest;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accNum='").append(accNum).append('\'');
        sb.append(", custNum='").append(custNum).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", interest=").append(interest);
        sb.append('}');
        return sb.toString();
    }
}
