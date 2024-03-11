package s4;

import java.util.Random;
import java.util.Scanner;

public class Number2digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = 10 + random.nextInt(90);
        int a = 0;

        System.out.println("num = " + num);
        System.out.println("숫자 맞추기 게임 시작!!");
        System.out.println("10부터 99 사이의 숫자를 맞추세요.");

        do {
            System.out.print("어떤 숫자일까요?: ");
            a = scanner.nextInt();
            if (a > num) {
                System.out.println("더 작은 숫자 입니다.");
            } else if (a < num) {
                System.out.println("더 큰 숫자 입니다.");
            } else {
                System.out.println("정답입니다.");
                break;
            }
        } while (true); // a != num이면 계속 반복한다.

    }
}
