package bank;

public class BankAcc extends Account{
    private int autoTransDate;

    public BankAcc() {
    }

    public BankAcc(String accNum, String custNum, long balance, double interest, int autoTransDate) {
        super(accNum, custNum, balance, interest);
        this.autoTransDate = autoTransDate;
    }

    public void transMoney(long money) {
        if (this.getBalance() < money || money < 0){
            System.out.println("Not enough balance");
            return;
        }
        this.setBalance(this.getBalance() - money);
    }

    @Override
    public String toString() {
        return super.toString() + " autoTransDate = " + this.autoTransDate;
    }
}
