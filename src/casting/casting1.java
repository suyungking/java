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
/* 자바는 기본적으로 같은 타입에 값을 대입할 수 있다.
 자동 형변환은 결국 대입하는 형을 맞추어야 한다.
 doubleValue = 10
 doubleValue = (double) intValue // 형 맞추기
 doubleValue = (double) 10 // 변수 값 읽기
 doubleValue = 10.10 // 형변환
 (double)과ㅓ 같이 적어주면 int 형이 double형으로 형이 변한다. 이렇게 형이 변환되는 것을 형변환이라고 한다.
 이러한 과정은 자동으로 이러나기 때문에 자동 형변환 또는 묵시적 형변환이라고 한다.
 */
