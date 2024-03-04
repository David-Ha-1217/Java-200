package s3;

import java.util.Scanner;

public class Modulo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int num = scanner.nextInt();

        if (num > 0) {
            if (num % 3 == 0) {
                System.out.println("이 값은 3으로 나누어집니다.");
            } else if (num % 3 == 1) {
                System.out.println("이 값은 3으로 나눈 나머지는 1입니다.");
            } else {
                System.out.println("이 값은 3으로 나눈 나머지는 2입니다.");
            }
        } else {
            System.out.println("양수가 아닌 값을 입력했습니다.");
        }
    }
}
