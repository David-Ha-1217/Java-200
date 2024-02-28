package s2;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주소: ");
        String address = scanner.nextLine();

        System.out.println("주소는 " + address + " 입니다.");
    }
}
