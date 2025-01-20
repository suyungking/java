package method;

public class method4 {
    public static void main(String[] args) {
        checkAge(15);
        checkAge(19);
    }


    public static void checkAge(int age){
        if(age<18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다 ");

        }
        else{
            System.out.println(age + "살, 출입이 가능합니다.");
        }
    }
}
