package app;

import company.Employee;
import company.SalesEmployee;
import company.SecretaryEmployee;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("100", "Ace", "Dev", 1000L);
        System.out.println(emp1);
        Object obj1 = new Employee("100", "Ace", "Dev", 1000L);
        System.out.println(obj1);

        Employee emp2 = new SalesEmployee("101", "Zoro", "Dev", 2000L, 500L);
        System.out.println(emp2);

        Employee [] emps  = new Employee[3];
        emps[0] = new Employee("100", "Ace", "Dev", 1000L);
        emps[1] = new SalesEmployee("100", "Ace", "Dev", 1000L, 500);
        emps[2] = new SecretaryEmployee("100", "Ace", "Dev", 1000L, "King");

        for(Employee e:emps) {
            System.out.println(e.getAnnSalary());
        }
    }
}
