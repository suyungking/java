package casting;

public class casting2 {
    public static void main(String[] args){
        double doubleValue = 1.5 ;
        int intValue = 0 ;

        // intValue = doubleValue  컴파일 오류 발생
        intValue = (int) doubleValue ;  // 형변환 (명시적)
        System.out.println(intValue); // 1
    }
}