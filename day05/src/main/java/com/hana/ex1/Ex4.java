package com.hana.ex1;

public class Ex4 {
    public static void main(String[] args) {
        String str = "1000";
        int num = 0;
        try {
            num = Integer.parseInt(str);
            System.out.println(num);
            int result = 10/0;
        }catch (NumberFormatException e){
            System.out.println("no , in number");
        }catch (ArithmeticException e) {
            System.out.println("no 0 under the bar");
        }
    }
}
