package s2;

import java.util.Random;

public class RandomInteger {

    public static void main(String[] args) {

        Random random = new Random();

        int num1 = 1 + random.nextInt(9);
        int num2 = -1 - random.nextInt(9);
        int num3 = 10 + random.nextInt(90);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
