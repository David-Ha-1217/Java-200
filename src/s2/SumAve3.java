package s2;

public class SumAve3 {

    public static void main(String[] args) {
        int x = 63;
        int y = 18;
        int z = 52;

        // or
        // int x = 63, y = 18; z = 52;

        int sum = x + y + z;
        int avg = sum / 3;

        System.out.println("합계는 " + sum + " 입니다.");
        System.out.println("평균는 " + avg + " 입니다.");
    }
}
