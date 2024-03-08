package variable;

public class Variable4 {
    public static void main(String[] args) {
        String str = "skyains@naver.com";

        String[] str1 = str.split("@");


        String id = str1[0].toUpperCase();
        String domain = str1[1].toUpperCase();
        System.out.printf("%s, %s", id, domain);
    }
}
