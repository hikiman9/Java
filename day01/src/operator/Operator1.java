package operator;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        long c = a / b;

        int d = 10;
        int e = 10;
        double f =  d * 1.0 / e;
        System.out.println(f);

        int rst = d + e;
        System.out.println(rst++);

        int num1 = 40;
        int num2 = 60;
        int num3 = 30;

        int num4 = (num1 > num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
        System.out.println(num4);
    }
}
