package method;

public class method7 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1.changeNumber 호출전, num1 : " + number );
        changeNumber(number);
        System.out.println("4.changeNumber 호출후, num1 : " + number );
    }
    public static void changeNumber(int number){
        System.out.println("2.changeNumber 변경전, num2 : " + number);
        number = number *2;
        System.out.println("3.changeNumber 변경후, num2 : " + number);
    }
}


// main()과 changeNumber()의 Number은 서로 완전히 분리된 다른 변수이다.