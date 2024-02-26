package s2;

public class SumAveError {
    public static void main(String[] args) {
//        int x;  // 컴파일 오류 (int형 타입은 정수만 가능하다.)
//        int y;

        double x;
        double y;

        x = 63.4;
        y = 18.3;

        System.out.println("x 값은 " + x + " 입니다.");
        System.out.println("y 값은 " + y + " 입니다.");
        System.out.println("합계는 " + (x+y) + " 입니다.");
        System.out.println("평균는 " + (x+y/2) + " 입니다.");

    }
}
