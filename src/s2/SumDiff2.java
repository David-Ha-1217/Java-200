package s2;

public class SumDiff2 {

    public static void main(String[] args) {
        System.out.println("82 + 17 = " + (82 + 17) );
        System.out.println("82 - 17 = " + (82 - 17) );

        // ()가 없다면?
        // 82 + 17 = 8217
        System.out.println("82 + 17 = " + 82 + 17 );
        // 컴파일 오류
        // System.out.println("82 - 17 = " + 82 - 17 );
    }
}
