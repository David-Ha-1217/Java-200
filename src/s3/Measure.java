package s3;

import java.util.Scanner;

public class Measure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("변수 a: ");
        int a = scanner.nextInt();
        System.out.print("변수 b: ");
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println("b는 a의 약수입니다.");
        } else {
            System.out.println("b는 a의 약수가 아닙니다.");
        }

        // Measure2
        if (a % b != 0) {
            System.out.println("b는 a의 약수가 아닙니다.");
        } else {
            System.out.println("b는 a의 약수입니다.");
        }
    }
}
