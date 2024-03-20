package s2;

public class SumAveError {

    public static void main(String[] args) {
        // 컴파일 에러
        // int x = 63.4;
        // int y = 18.3;

        // double
        double x = 63.4;
        double y = 18.3;

        System.out.println("x의 값은 " + x + " 입니다.");
        System.out.println("y의 값은 " + y + " 입니다.");

        System.out.println("합계는 " + (x + y) + " 입니다.");
        System.out.println("평균은 " + (x + y) / 2 + " 입니다.");
    }
}
