package s3;

import java.util.Scanner;

public class Md3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();
        System.out.print("정수 c: ");
        int c = scanner.nextInt();

        int med = 0;

//        if (a >= b) {
//            if (b >= c) {
//                med = b;
//            } else if (c >= a) {
//                med = a;
//            } else {
//                med = c;
//            }
//        } else if (a > c) { // a < b
//            med = a;
//        } else if (b < c) {
//            med = b;
//        } else {
//            med = c;
//        }

        if ((a >= b) && (a <= c) || (a >= c) & (a <= b)) {
            med = a;
        } else if ((a < b) && (b < c) || (b > c) && (b < a)) {
            med = b;
        } else {
             med = c;
        }

        System.out.println("중앙값은 " + med + "입니다.");
    }
}
