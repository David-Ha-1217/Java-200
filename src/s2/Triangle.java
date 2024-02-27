package s2;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 넓이를 구합니다.");
        System.out.print("밑변: ");
        double x = scanner.nextDouble();

        System.out.print("높이: ");
        double y = scanner.nextDouble();

        System.out.println("넓이는 " + (x * y) / 2 + "입니다.");
    }
}
