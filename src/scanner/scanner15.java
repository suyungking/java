package scanner;

import java.util.Scanner;

public class scanner15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        double aver = 0;
        int count =0;
        int input =0;
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
//        while(true) {
//
//            int num1 = input.nextInt();
//
//            if (num1 ==-1){
//
//                break;
//            }
//            sum += num1;
//            count ++;
//
//
//        }
        while((input = scanner.nextInt()) != -1){
            sum += input;
            count++;
        }
        aver = (double) sum/count;
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + aver);
    }
}
