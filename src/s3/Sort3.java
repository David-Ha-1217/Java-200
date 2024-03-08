package s3;

import java.util.Scanner;

public class Sort3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = scanner.nextInt();


        System.out.print("정수 b:");
        int b = scanner.nextInt();


        System.out.print("정수 c:");
        int c = scanner.nextInt();

        System.out.println("a<=b<=c가 되도록 정렬했습니다.");

        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 c는 " + c + "입니다.");
    }
}
