package s2;

import java.util.Scanner;

public class ScanInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int n = scanner.nextInt();

        System.out.println(n + "을 입력했습니다.");
    }
}
