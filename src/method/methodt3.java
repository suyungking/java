package method;

import java.util.Scanner;

public class methodt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean falg = true;
        int balance = 0;


        while(falg){
            System.out.println("-------------------------");
            System.out.println(("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료"));
            System.out.println("-------------------------");
            System.out.print("선택 : ");
            int ch = sc.nextInt();

            sc.nextLine();

            switch (ch){
                case 1:
                    System.out.print("입력금액을 입력하세요 : ");
                    int price = sc.nextInt();
                    balance = dlqrma(balance,price);

                    break;

                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    int price1 =sc.nextInt();
                    balance = cnfrma(balance,price1);
                    break;
                case 3:
                    check(balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    falg = false;
                    break;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    public static int dlqrma(int balance , int in){
        balance += in;
        System.out.println(in + " 원을 입금하셨습니다. 현재 잔액 : " + balance +"원");
        return balance;
    }

    public static int cnfrma(int balance, int out){
        if ( balance >= out){
            balance -= out;
            System.out.println(out + "won을 출금하엿습니다. 현재 잔액 : " + balance +"won");
        }
        else {
            System.out.println(out + "won을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
    public static void check(int balance){
        System.out.println("현재 잔액 : "+balance);
    }



}
