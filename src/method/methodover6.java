package method;

public class methodover6 {
    public static void main(String[] args) {
        System.out.println("1  :" + add(1,2));
        System.out.println("2  :" + add(1.5,1.5));

    }
//    public static int add( int a, int b ){
//        System.out.println("1번 호출");
//        return a+b;
//    }
    // 실행이 됨 자동형변환이 되어서

    public static double add(double a , double b){
        System.out.println("2번 호출");
        return a+b;
    }
}
