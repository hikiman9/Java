package array;

import java.util.Arrays;
import java.util.Random;

public class Array7 {
    public static void main(String[] args) {

        Random r = new Random();

        int [][] mtx = new int[5][5];

        int i = 0;
        int j = 0;

        int min = 0;
        int max = 0;

        while (i < mtx.length) {
            while (j < mtx[i].length) {
                int num = r.nextInt(100) + 1;
                if (Arrays.asList(mtx[i]).contains(num)) {
                    continue;
                }
                mtx[i][j] = num;
                j += 1;
            }
            Arrays.sort(mtx[i]);
            min += mtx[i][0];
            max += mtx[i][4];
            i += 1;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
