import java.util.Arrays;
import java.util.Scanner;

public class SeatArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] inputArr = input.split(" ");

        int [] intArr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i ++) {
            intArr[i] = Integer.parseInt(inputArr[i]);
            System.out.println(intArr[i]);
        }

        int studentNum = intArr[0];
        int line = intArr[1];

        Arrays.sort(intArr);

    }
}

