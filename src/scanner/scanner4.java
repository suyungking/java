package scanner;

import java.util.Scanner;

public class scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.print("문자를 입력하세요(exit)를 입력하면 종료됩니다.:");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("입력한 문자열 :" + str);
        }

    }
}