package bankapp;

import bank.Account;

public class BankApp {
    public static void main(String[] args) {
//        System.out.println(Account.count);
//        Account acc1 = new Account();
        Account acc1 = new Account("", "James", 5000L, 2.3);
        Account acc2 = new Account("", "Tom", 5000L, 2.3);
        Account acc3 = new Account("", "Jack", 5000L, 2.3);
        Account acc4 = new Account("", "Peter", 5000L, 2.3);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);

//        System.out.println(acc1);
//        System.out.println(acc2);
//        acc2.deposit(-1000L);
//        System.out.println(acc2);
//        acc2.withdraw(1000000000000000L);
//        System.out.println(acc2);
//        System.out.println(Account.count);
    }
}
