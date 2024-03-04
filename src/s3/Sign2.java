package s3;

import java.util.Scanner;

public class Sign2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("값이 양수 입니다.");
        } else if (num < 0) {
            System.out.println("값이 음수 입니다.");
        } else if (num == 0) {  // else 대신에, else if (num == 0)으로 변경 한다면?
            System.out.println("값이 0 입니다.");
        }
    }
}
