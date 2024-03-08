package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(100, "id01", "james", 200000);
        //emp.sal = 5000000;
        long sal = emp.getSal();
        long annSal = emp.getAnnSalary();

        System.out.println(annSal);
    }
}
