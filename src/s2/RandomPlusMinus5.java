package s2;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("정숫값: ");
        int num = scanner.nextInt();

        int p = (num-5) + random.nextInt(11);
        System.out.println("입력한 값의 +-5 범위의 난수를 생성했습니다.");
        System.out.println("값은 " + p + "입니다.");
    }
}
