package s4;

import java.util.Scanner;

public class ThreeDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        do {
            System.out.print("세 자리의 정숫값: ");
            num = scanner.nextInt();

            if (num >= 100 && num <= 999) {
                System.out.println("입력한 값은 " + num + "입니다.");
                break;
            }
        } while (num < 100);
    }
}
