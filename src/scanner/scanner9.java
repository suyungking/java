package scanner;

import java.util.Scanner;

public class scanner9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 : ");
        String str1 = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요 :");
        int num1 = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요 :");
        int num2 = scanner.nextInt();

        int sum = num1 *num2;
        System.out.println(str1+ num2+"를 주문하셨습니다. " +"총 가격은 " + sum+ "원 입니다.");
    }
}
