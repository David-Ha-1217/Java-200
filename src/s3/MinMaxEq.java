package s3;

import java.util.Scanner;

public class MinMaxEq {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();

        int max = 0;
        int min = 0;

        if (a == b) {
            System.out.println("두 값은 같습니다.");
        } else {
            if (a > b) {
                max = a;
                min = b;
            } else {
                max = b;
                min = a;
            }
        }

        System.out.println("작은 값은 " + min + "입니다.");
        System.out.println("큰 값은 " + max + "입니다.");
    }
}
