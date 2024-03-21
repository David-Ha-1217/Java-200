package s2;

import java.util.Scanner;

public class globe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1416;

        System.out.println("구의 겉넓이와 부피를 구합니다.");
        System.out.print("반지름: ");
        double r = scanner.nextDouble();

        double area = 4 * PI * r * r;
        double volume = 4 / 3.0 * PI * r * r * r;

        System.out.println("겉넓이는 " + area + "입니다.");
        System.out.println("부피는 " + volume + "입니다.");
    }
}
