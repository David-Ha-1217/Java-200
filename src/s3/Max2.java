package s3;

import java.util.Scanner;

public class Max2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수 a: ");
        double a = scanner.nextDouble();

        System.out.print("실수 b: ");
        double b = scanner.nextDouble();

//        if (a > b) {
//            System.out.println("큰 쪽의 값은 " + a + "입니다.");
//        } else if (a == b) {
//            System.out.println("a와 b의 값이 같습니다.");
//        } else {
//            System.out.println("큰 쪽의 값은 " + b + "입니다.");
//        }

        // 삼항 연산자
        double max = (a > b) ? a : b;
        System.out.println("큰 쪽의 값은 " + max + "입니다.");
    }
}
