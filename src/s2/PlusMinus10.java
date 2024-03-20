package s2;

import java.util.Scanner;

public class PlusMinus10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int n = scanner.nextInt();

        System.out.println("10을 더한 값은 " + (n + 10) + "입니다.");
        System.out.println("10을 뺀 값은 " + (n - 10) + "입니다.");

        // Ref
        int plus = n + 10;
        int minus = n - 10;

        System.out.println("Ref: ");
        System.out.println("10을 더한 값은 " + plus + "입니다.");
        System.out.println("10을 뺀 값은 " + minus + "입니다.");
    }
}
