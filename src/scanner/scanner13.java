package scanner;

import java.util.Scanner;

public class scanner13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String str1 = scanner.nextLine();
            if(str1.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요  : ");
            int age = scanner.nextInt();  //nextInt()는 10\n하면 \n이 입력에 남아있음  그래서 빈문자가 들어감 nextLine은 그래서 빈문자가 들어감 이름을 입력하세요 (종료를 입력하면 종료) : 나이를 입력하세요  : 종료 그래서 이렇게 나옴
            scanner.nextLine(); // \n이거를 읽고 버림


            System.out.println("입력한 이름 : " +str1 +  "나이 : "+age);

        }
    }
}
