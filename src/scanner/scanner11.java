package scanner;

import java.util.Scanner;

public class scanner11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        System.out.print("숫자를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("숫자를 입력하세요 : ");
        int b = scanner.nextInt();

        temp = a;

        a = b;

        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
