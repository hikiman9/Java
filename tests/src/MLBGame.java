import java.util.Random;

public class MLBGame {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        System.out.println("게임시작!");

        int outCount = 0;
        int batter = 1;

        while (outCount < 3) {
            System.out.println(batter + "번 타자");

            int ballCount = 0;
            int strikeCount = 0;

            while (ballCount < 4 || strikeCount < 3) {
                int pitch = random.nextInt(2);
                if (pitch == 0) {
                    System.out.println("스트라이크!");
                    strikeCount++;
                } else {
                    System.out.println("볼~");
                    ballCount++;
                }
                Thread.sleep(1000); // 1초 딜레이
            }

            if (ballCount == 4) {
                System.out.println("1루 진루!");
            } else if (strikeCount == 3) {
                System.out.println("삼진 아웃!");
                outCount++;
            }

            batter++;
        }

        System.out.println("게임종료!");
    }
}