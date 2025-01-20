package method;

public class method6 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1.changeNumber 호출전, num1 : " + num1 );
        changeNumber(num1);
        System.out.println("4.changeNumber 호출후, num1 : " + num1 );
    }
    // 자바는 항상 변수의 값을 복사해서 대입한다
    // 건들지않음 Num1을
    // 10을 num2다가만 복사함 그래서 num1에 영향을 주지않는다 왜냐하면 앞서 값을 복사해서 전달했기 떄문이다.

    public static void changeNumber(int num2){
        System.out.println("2.changeNumber 변경전, num2 : " + num2);
        num2 = num2 *2;
        System.out.println("3.changeNumber 변경후, num2 : " + num2);

    }
}
