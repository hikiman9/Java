package condition;

public class condition1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Start ...");
        System.out.println("Connet ...");
        if (a < 20) {
            System.out.println("Disconnect ...");
            System.out.println("End ...");
            return;
        }
        System.out.println("Database Add Impl ...");
        System.out.println("Disconnect ...");
        System.out.println("End ...");
    }
}
