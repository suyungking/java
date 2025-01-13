package scanner;

import java.util.Scanner;

public class scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        System.out.println("숫자 0을 입력하면 프로그램이 종료됩니다.");
        while(true){
            System.out.print("숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();

            if(num1 ==0){
                System.out.println("0을 입력하셔서 프로그램을 종료합니다.");
                break;
            }
            else{
                sum += num1 ;
                System.out.println("지금까지의 sum의 합계" + sum);
            }
        }

    }
}
