package array;

public class Array3 {
    public static void main(String[] args) {
        Customer [] customers = new Customer[3];
        customers[0] = new Customer("id00", "pwd00", "name00");
        customers[1] = new Customer("id01", "pwd01", "name01");
        customers[2] = new Customer("id02", "pwd02", "name02");

        for(Customer c : customers){
            System.out.println(c);
        }
    }
}
