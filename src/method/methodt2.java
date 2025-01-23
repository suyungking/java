package method;

public class methodt2 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = dlqrma(balance,5000);
        balance = cnfrma(balance,20000);
        System.out.println("최종 잔액 : " +balance+"won");
    }

    public static int dlqrma(int balance,int in){
        balance += in;
        System.out.println(in + "won을 입금하였습니다. 현재 잔액 : " + balance +"won" );
        return balance;


    }

    public static int cnfrma(int balance, int out) {
        if ( balance >= out){
            balance -= out;
            System.out.println(out + "won을 출금하엿습니다. 현재 잔액 : " + balance +"won");
        }
        else {
            System.out.println(out + "won을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
