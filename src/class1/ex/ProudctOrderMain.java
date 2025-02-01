package class1.ex;

public class ProudctOrderMain {
    public static void main(String[] args) {
        ProductOrder po = new ProductOrder();
        po.productName = "pizza";
        po.price = 20000;
        po.quantity = 3;

        ProductOrder po1 = new ProductOrder();
        po1.productName = "chicken";
        po1.price=18000;
        po1.quantity = 4;

        ProductOrder[] poa = new ProductOrder[]{po,po1};
        int sum = 0;
        for (ProductOrder order : poa) {
            System.out.println("상품 이름  : " + order.productName + "가격 : " + order.price + " 수량 : " + order.quantity);
            sum += order.price * order.quantity;
        }
        
        System.out.println("총 결제 금액   : " + sum);
    }
}
