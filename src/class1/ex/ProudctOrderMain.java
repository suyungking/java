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
//  기본형 변수에는 직접 사용할 수있는 값이 들어있지만 참조형 변수에는 위치가 들어가있다
//// 참조형 변수를 문가 하려ㅑ면 결국 참조값을 통해 해당 위치로 이동해야한다
// 기본형은 들어있는 값을 그대로 게산에 사용할 수있다.
// 참조형은 들어있는 참조값을 그대로 사용할 수 없다. 주소지만 가지고는 할 수 있는게  없다. 주소지에 가야 실체가있다.
// .을 통해 객체의 기본형 멤버 변수에 접근한 경우에는 연산을 할 수 있다.
// 기본형을 제외한 나머지는 모두 참조형이다
// 기본형은 소문자로 시작 / 자바가 기본으로 제공하는 데이터 타입이다.
// 클래스는 대문자로 시작한다. 클래스는 모두 참조형이다
// 대원칙 자바는 항상 변수의 값을 복사해서 대입한다
// 기본형 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다. 기본형이면 변수에 들어있는 실제 사용하는 값을 복사해서 대입
// 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.
// 참조형의 경우 실제 사용하는 객체가 아니라 객체의 위치를 가르키는 참조값만 복사된다.
// 쉽게 예기하면 건물이 복사가 되는 것이 아니라 건물의 위치인 주소만 복사되는것이다. 따라서 건물을 찾아갈 수 있는 방법이 하나 늘어날 뿐
