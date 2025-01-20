package method;

public class method1 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= program start = ");
        return; // void의 경우 생략가능

    }

    public static void printFooter(){
        System.out.println("= program end =");
    }
}

// 매개변수가 없는 경우
//선언 : public static void prinheader()와 같이 매개변수를 비워두고 정의하면 된다
//호출: printheader()l;와 같이 인수를 비워두고 호출하면 된다.
//
//변환 타입이 없는 경우
//선언 : public static void printheader()와 같이 반환 타입을 void로 정의하면 된다
//호츌 : printheader()와 같이 반환 타입이 없으므로 메소드만 호출하고 반환값을 받지 않으면 된다