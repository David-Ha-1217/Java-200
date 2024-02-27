package s2;

import java.util.Scanner;

public class PlusMinus10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int num = scanner.nextInt();

        System.out.println("10을 더한 값은 " + (num + 10) + "입니다.");
        System.out.println("10을 뺀 값은 " + (num - 10) + "입니다.");
    }
}
