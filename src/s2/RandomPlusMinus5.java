package s2;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("정숫값: ");
        int n = scanner.nextInt();

        System.out.println("입력 값의 +-5범위의 난수를 생성했습니다.");
        int randomNum = (n - 5) + random.nextInt(11);
        System.out.println(randomNum);
    }
}
