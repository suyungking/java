package casting;

public class casting1 {
    public static void main(String[] atgs){
        int intValue = 10;
        long longValue ;
        double doubleValue;

        longValue = intValue ; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int - > double
        System.out.println("doubleValue = "+ doubleValue);

        doubleValue = 20000L ;  // long - > double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
// 자바는 기본적으로 같은 타입에 값을 대입할 수 있다.