package method;

public class methodover3 {
    public static void main(String[] args) {
        System.out.println("1 : " + add(1,2));
        System.out.println("2 : " + add(1.5,2.5));
    }

//    public static int add(int a, int b ){
//        System.out.println("1번 호출");
//        return a+b;
//    }
    // 생력해도 자동 형변환이 발생해서 2번째꺼가 호출된다

    public static double add(double a, double b ){
        System.out.println("2번 호출");
        return a+b;
    }
}
// 먼저 본인의 타입에 최대한 맞는 메서드를 찾아서 실행하고 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행한다