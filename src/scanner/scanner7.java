package scanner;

import java.util.Scanner;

public class scanner7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : "); //이름을 입력받는다.
        String str = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요 : "); // 나이를 입력받는다
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + str +"이고, 나이는" + age +"살 입니다.");
    }
}
