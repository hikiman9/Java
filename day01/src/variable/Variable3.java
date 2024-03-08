package variable;

public class Variable3 {
    public static void main(String[] args) {
        int a = 10;
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = new String("abc");
        System.out.println(str1 + str2 + str3);

        System.out.println(str2 == str3);

        int num = 100;
        String result = String.valueOf(num);
    }
}
