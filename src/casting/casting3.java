package casting;

public class casting3 {
    public static void main(String[] args){
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        // int 형의 작은 숫자가 나옴. 오버플로우 발생했다. 발생하면 변수의 타입을 변경해서 사이즈를 늘려주자!
        System.out.println("maxInOver casting = " + intValue);
    }
}
