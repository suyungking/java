package scanner;

import java.util.Scanner;

public class scanner8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        if(num1 % 2==0){
            System.out.println("입력하신 "+num1+"은 짝수입니다.");
        }
        else{
            System.out.println("입력하신 "+num1+"은 홀수입니다.");
        }
    }
}
