import java.util.Scanner;

public class TSNGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for(int i = 1; i < limit + 1; i ++){
            if (i % 3 == 0){
                System.out.print(" X ");
            } else{
                System.out.print(" " + i + " ");
            }
        }
    }
}
