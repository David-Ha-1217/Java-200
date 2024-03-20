package s2;

import java.util.Scanner;

public class LowesDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int n = scanner.nextInt();

        int l = n / 10;
        int d = n % 10;

        System.out.println("마지막 자릿수를 제외한 값은 " + l + "입니다.");
        System.out.println("마지막 자릿수는 " + d + "입니다.");
    }
}
