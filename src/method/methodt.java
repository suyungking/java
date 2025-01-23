package method;

public class methodt {
    public static void main(String[] args) {
        int sum = add(1,2,3);

        double aver = aver(sum, 3.0);

        System.out.println("평균값 : " + aver );

        int sum1 = add(15,25,35);
        double aver1 = aver(sum1, 3.0);

        System.out.println("평균값 : " + aver1);

    }
    public static int add(int a , int b , int c){
        return a+b+c;
    }

    public static double aver(int sum , double i){
        return sum / i;
    }
}
