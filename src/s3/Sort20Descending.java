package s3;

import java.util.Scanner;

public class Sort20Descending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();

        if (a < b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("a >= b가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
    }
}
