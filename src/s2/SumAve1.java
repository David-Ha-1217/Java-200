package s2;

public class SumAve1 {
    public static void main(String[] args) {
        int x = 63;
        int y = 18;

        System.out.println("x 값은 " + x + " 입니다.");
        System.out.println("y 값은 " + y + " 입니다.");
        System.out.println("합계는 " + (x+y) + " 입니다.");
        System.out.println("평균는 " + (x+y/2) + " 입니다.");

        // Ref
        int sum = x + y;
        int average = sum / 2;
        System.out.println("합계는 " + sum + " 입니다.");
        System.out.println("평균는 " + average + " 입니다.");
    }
}
