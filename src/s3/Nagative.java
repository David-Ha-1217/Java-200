package s3;

import java.util.Scanner;

public class Nagative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("이 값은 음의 값 입니다.");
        } else {
            System.out.println("이 값은 양의 값 입니다.");
        }
    }
}
