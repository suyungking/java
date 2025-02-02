package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("rice" , 10000 , 3);

        orders[1] = createOrder("milk" , 2000 , 5);

        orders[2] = createOrder("fish" , 20000 , 3);

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
