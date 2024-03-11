package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee(0, "10001", "intern1", 200000L);
        Employee emp2 = new Employee(0, "10002", "intern2", 200000L);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
}
