package s2;

import java.util.Random;

public class RandomDouble {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("3개의 난수를 생성했습니다.");
        double n1 = random.nextDouble();
        double n2 = -1 - random.nextDouble() * 10;
        double n3 = -1 * 2 + random.nextDouble();

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
    }
}
