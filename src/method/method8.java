package method;

public class method8 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1.changeNumber 호출전, num1 : " + num1 );
        num1 = changeNumber(num1);
        System.out.println("4.changeNumber 호출후, num1 : " + num1 );
    }
    public static int changeNumber(int num2){
        System.out.println("2.changeNumber 변경전, num2 : " + num2);
        num2 = num2 *2;
        System.out.println("3.changeNumber 변경후, num2 : " + num2);
        return num2;
    }
}
// 자바는 항상 변수의 값을 복사해서 대입한다 중요