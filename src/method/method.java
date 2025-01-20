package method;

public class method {
    public static void main(String[] args) {
        int sum = add(5,3);
        System.out.println("결과출력 :"+ sum);


        int sum1 = add(1,9);
        System.out.println("결과출력 :"+ sum1);

    }
    // add 메서드
    public static int add(int a, int b){
        System.out.println(a +  " + " + b + " 연산수행");
        int sum = a+b;
        return sum;
    }
}
