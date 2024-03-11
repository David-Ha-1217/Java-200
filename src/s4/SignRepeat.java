package s4;

import java.util.Scanner;

public class SignRepeat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("정숫값: ");
            int num = scanner.nextInt();

            if (num > 0) {
                System.out.println("값이 양수 입니다.");
            } else if (num == 0) {
                System.out.println("값이 0 입니다.");
            } else {
                System.out.println("값이 음수 입니다.");
            }

            System.out.println("다시 한번? 1 - YES / 0 - No : ");
            int retry = scanner.nextInt();;

            if (retry == 1) {
                continue;
            } else {
                break;
            }
        }




    }

}
