package casting;

public class casting4 {
    public static void main(String[] args){
        int div1 = 3/2; // int / int
        System.out.println("div1 = " + div1); // 1

        double div2 = 3/2; //int / int
        System.out.println("div2 = " + div2); // int 타입으로 결과가 나온다 그리고 double로 형변환 되었다. 1.0

        double div3 = 3.0 /2 ; // double / int
        System.out.println("div3 = " + div3); // double / double 로 형변환이 발생한다. 1.5

        // int 형끼리 나눗셈을 해서 소수 까지 구하고 싶으면 div4처럼 명시적 형변환을 해주면 된다.
        double div4 = (double) 3/2 ; //명시적 형변환을 사용했다.
        System.out.println("div4 = " + div4); // double / double 1.5

        int a = 3 ;
        int b = 2;
        double result = (double) a/b; // double + int 이므로 더 큰 범위로 형변환 double/double -> double이 된다.
        System.out.println("result = "+ result ); // 1.5
    }
}
/* 자바에서의 계산은 2가지 기억하자
1. 같은 타입끼리의 계산은 같은 타입의 계산을 낸다 .
2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 자동으로 일어난다.
 */
