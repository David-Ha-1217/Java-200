package s3;

import java.util.Scanner;

public class Multiple0f10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int n = scanner.nextInt();

        if (n > 0) {
            if (n % 10 == 0) {
                System.out.println("이 값은 10의 배수 입니다.");
            } else {
                System.out.println("이 값은 10의 배수가 아닙니다.");
            }
        } else {
            System.out.println("음의 정숫값을 입력했습니다.");
        }
    }
}
