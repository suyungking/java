package method;

public class methodcas {
    public static void main(String[] args) {
        double number = 1.5;
        printNumber((int) number);  // 명시적 형변환을 사용해서 int로 변환
    }
    public static void printNumber(int n){
        System.out.println("숫자 : "+ n );
    }
}
// 메소드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다. 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출 할 수 있다.