import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수를 입력하세요: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("홀수를 입력해주세요.");
            return;
        }

        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n - i - 1; j += 2) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
