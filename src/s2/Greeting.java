package s2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("성: ");
        String firstName = scanner.nextLine();
        System.out.print("이름: ");
        String lastName = scanner.nextLine();
        System.out.println("안녕하세요." +firstName + lastName + "씨.");
    }
}
