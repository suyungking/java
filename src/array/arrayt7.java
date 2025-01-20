package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class arrayt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productCount = 0;
        String[] prodictNames = new String[10];
        int[] productPrices = new int[10];
        boolean flag = true;
        while(flag){

            System.out.println("1.상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1:
                    if (productCount == 10){
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    else {
                        System.out.print("상품 이름을 입력하세요 : ");
                        String name = sc.nextLine();

                        System.out.print("상품 가격을 입력하세요 : ");
                        int price = sc.nextInt();

                        for (int i = productCount; i <= productCount; i++) {
                            prodictNames[i] = name;
                            productPrices[i] = price;
                        }
                        productCount++;
                        break;
                    }

                case 2:
                    if (productCount==0){
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    else {
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(prodictNames[i] + ":" + productPrices[i]);
                        }
                        break;
                    }

                case 3:
                    System.out.println("프로그램을 종료합니다");
                    flag = false;
                    break;

            }

        }


    }
}
