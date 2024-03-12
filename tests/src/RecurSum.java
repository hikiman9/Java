import java.util.Scanner;

public class RecurSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("50 이하의 숫자 입력하셈: ");
        int limit = sc.nextInt();
        int answer = 0;
        if (limit > 50){
            System.out.println("장난하지 마셈 그렇게 큰 숫자는 못 더함");
            return;
        }
        for (int i = 1; i <= limit; i ++) {
            answer += sum(i);
        }
        System.out.println(answer);
    }
    private static int sum(int n) {
        int all = 0;
        for (int i = 1; i <= n; i ++) {
            all += i;
        }
        return all;
    }
}
