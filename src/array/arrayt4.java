package array;

import java.util.Scanner;

public class arrayt4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min , man ;
        System.out.print("입력받을 숫자의 개수를 입력하세요 :" );
        int a = scanner.nextInt();
        int[] num = new int[a];
        System.out.println(a+"개의 정수를 입력하세요 : ");
        for(int i =0; i<num.length; i++){
            num[i] = scanner.nextInt();
        }

        min = man = num[0];
        for (int i = 1; i<a; i++){
            if(num[i]<min){
                min = num[i];
            }
            else if(num[i] > man){
                man = num[i];
            }
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + man);



    }
}
