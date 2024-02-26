package s2;

import java.util.Scanner;

public class ScanInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("정수값: ");
        num = scanner.nextInt();

        System.out.println(num + "를 입력했습니다.");
    }
}
