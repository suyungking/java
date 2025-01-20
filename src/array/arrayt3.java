package array;

import java.util.Scanner;

public class arrayt3 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int sum =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요 : ");
        for(int i =0; i<num.length; i++){
            num[i] = scanner.nextInt();
            sum+= num[i];
        }

        System.out.println("입력한 정수의 합계 : "+ sum);

        double aver = (double) sum/num.length;
        System.out.println("입력한 정수의 평균 : " + aver);


    }
}
