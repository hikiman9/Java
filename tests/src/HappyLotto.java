import java.util.Random;

public class HappyLotto {
    public static void main(String[] args) {
        int[] lottoNumbers = new int[6];
        boolean[] numList = new boolean[46];
        Random random = new Random();

        int i = 0;
        while (i < lottoNumbers.length){
            int randomNum = random.nextInt(45) + 1;
            if (!numList[randomNum]){
                lottoNumbers[i] = randomNum;
                numList[randomNum] = true;
                System.out.print(randomNum + " ");
                i++;
            } else{
                System.out.print(randomNum + "(중복임 다시 하셈)");
            }
        }
    }
}
