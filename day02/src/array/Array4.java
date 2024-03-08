package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        // 10 사이의 랜덤 숫자
        Random r = new Random();

        int [] a = new int[10];
        int i = 0;
        int sum = 0;

        while (i < 10){
            int num = r.nextInt(100) + 1;
            if (Arrays.asList(a).contains(num)){
                continue;
            }
            a[i] = num;
            sum += a[i];
            i += 1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
        System.out.println(sum / (i + 0.0));
    }
}
