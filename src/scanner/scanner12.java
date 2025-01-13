package scanner;

import java.util.Scanner;

public class scanner12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2 ){
            temp = num1 ;

            num1 = num2;

            num2 = temp;
        }
        for(int i=num1; i<=num2; i++){
            System.out.print(i);
            if(i != num2) {
                System.out.print(",");
            }
            }
    }
}
