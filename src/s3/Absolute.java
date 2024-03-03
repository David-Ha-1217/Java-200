package s3;

import java.util.Scanner;

public class Absolute {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("절댓값은 " + num + "입니다.");
        } else {
            System.out.println("절댓값은 " + -num + "입니다.");
        }
    }
}
