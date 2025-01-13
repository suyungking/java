package scanner;

import java.util.Scanner;

public class scanner14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료) :");
            int num1 = input.nextInt();
            if(num1 == -1){
                break;
            }
            System.out.print("구매하려는 수량을 입력하세요 : ");
            int num2 = input.nextInt();

            int sum = num1 *num2;
            System.out.println("총 비용 : "+ sum);
        }
    }
}
