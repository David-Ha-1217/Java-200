package s3;

import java.util.Scanner;

public class Grade1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수: ");
        int grade = scan.nextInt();

        if (0 <= grade && grade <= 49) {
            System.out.println("가");
        } else if (50 <= grade && grade <= 59) {
            System.out.println("양");
        } else if (60 <= grade && grade <= 69) {
            System.out.println("미");
        } else if (70 <= grade && grade <= 79) {
            System.out.println("우");
        } else if (80 <= grade && grade <= 100) {
            System.out.println("수");
        } else {
            System.out.println("숫자를 잘못 입력하셨습니다.");
        }
    }
}
