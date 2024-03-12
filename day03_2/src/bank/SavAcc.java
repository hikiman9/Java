package bank;

public class SavAcc extends Account{
    private String startDate;
    private String endDate;
    private long payment;

    public SavAcc() {
    }

    public SavAcc(String accNum, String custNum, long balance, double interest, String startDate, String endDate, long payment) {
        super(accNum, custNum, balance, interest);
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
    }

    @Override
    public double getCalInterest() {
        int date = Integer.parseInt(endDate) - Integer.parseInt(startDate);
        return (payment * 1.0 /30) * date * (getInterest() / 365);
    }

    @Override
    public String toString() {
        return super.toString() + " 적금 기간: " + this.startDate + " ~ " + this.endDate + " 납입 금액: " + this.payment;
    }
}
