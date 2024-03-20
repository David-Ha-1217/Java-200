package s2;

import java.util.Scanner;

public class SumAveDouble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x의 값: ");
        double x = scanner.nextDouble();
        System.out.print("y의 값: ");
        double y = scanner.nextDouble();

        double sum = x + y;
        double ave = sum / 2;

        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균는 " + ave + "입니다.");
    }
}
