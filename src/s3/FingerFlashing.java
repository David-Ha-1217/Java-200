package s3;

import java.util.Random;

public class FingerFlashing {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.print("컴퓨터가 낸 것: ");
        int r = random.nextInt(3);

        switch (r) {
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }

    }
}
