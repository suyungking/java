package scanner;

import java.util.Scanner;

public class scanner16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =0 ;
        boolean a = true;

        while (a) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int num1 = scanner.nextInt();
            scanner.nextLine();
            switch (num1){
                case 1:
                    System.out.print("상품명을 입력하세요 : ");
                    String str = scanner.nextLine();

                    System.out.print("상품의 가격을 입력하세요 :");
                    int pr = scanner.nextInt();

                    System.out.print("구매 수량을 입력하세요 : ");
                    int ch = scanner.nextInt();

                    count += (pr*ch);

                    System.out.println("상품명 : " + str + " 가격 : "+ pr +" 수량 : " + ch + " 합계 :" + count  );
                    break;
                case 2:
                    System.out.println("총 비용 : " +count );
                    count =0;
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다");

                    a= false;
                    break;

                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");





            }
        }
    }
}
