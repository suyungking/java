package scope;

public class scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //X 생존 시작
            System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x );
        } // x 생존 종료

        //System.out.println("main x = " + x);
        System.out.println("main m = " + m );
    }
}
