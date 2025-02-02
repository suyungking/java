package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int number = sc.nextInt(); //1\n 여서 \n이 나옴 그래서 다음께 넘어가버림 그래서 아래를 써줌
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[number];

        for(int i =0; i<number; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print( "상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();

            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

            orders[i]  = createOrder(productName , price , quantity);

        }

        printOrders(orders);
        int sum = getTotalAmount(orders);
        System.out.println("총 결제 금액 : "  + sum);
    }

    static ProductOrder createOrder(String productName , int price , int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){

        for (ProductOrder order : orders) {
            System.out.println("상품 이름  : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int sum =0;
        
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;

    }
}
