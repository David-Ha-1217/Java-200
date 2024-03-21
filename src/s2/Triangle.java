package s2;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 넓이를 구합니다.");
        System.out.print("밑변: ");
        double a = scanner.nextDouble();
        System.out.print("높이: ");
        double b = scanner.nextDouble();

        double triangle = (a * b) / 2;
        System.out.println("녋이는 " + triangle + "입니다.");
    }
}
