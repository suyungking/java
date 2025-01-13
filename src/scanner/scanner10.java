package scanner;

import java.util.Scanner;

public class scanner10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =1;
        System.out.print("구구단의 단 수를 입력해주세요 : ");
        int num1 = scanner.nextInt();
        System.out.println(num1 + "단의 구구단: ");
        while(i<10){
            System.out.println(num1 + "*"+ i+ "=" + num1*i);
            i++;
        }
    }
}
