package s3;

import java.util.Scanner;

public class Balance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("변수 a: ");
        int a = scanner.nextInt();

        System.out.print("변수 b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a가 크다.");
        } else if (a < b) {
            System.out.println("b가 크다.");
        } else {
            System.out.println("a와 b가 같다.");
        }
    }
}