package array;

import java.util.Scanner;

public class arrayt2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요 : ");
        for(int i =0; i< num.length; i++){
            num[i] = scanner.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력 : ");

        for(int j= num.length-1; j >= 0; j--){
            System.out.print(num[j]);
            if(j>0){
                System.out.print(", ");
            }
        }
    }
}
