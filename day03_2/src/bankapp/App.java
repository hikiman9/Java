package bankapp;

import bank.Account;
import bank.BankAcc;
import bank.SavAcc;

public class App {
    public static void main(String[] args) {
        Account [] accs = new Account[3];
        accs[0] = new Account("10000", "Rex", 100000L, 3.4);
        accs[1] = new BankAcc("10000", "James", 300000L, 3.4, 10);
        accs[2] = new SavAcc("10000", "Tom", 200000L, 3.4, "180412", "191208", 100000L);

        BankAcc bankAcc = new BankAcc("10001", "Kane", 400000L, 2.5, 24);

        System.out.println(accs[0]);
        System.out.println(accs[1]);
        System.out.println(accs[2]);
        System.out.println(bankAcc);

        bankAcc.transMoney(1000);
        System.out.println(bankAcc);
        System.out.println(accs[2].getCalInterest());

    }
}
