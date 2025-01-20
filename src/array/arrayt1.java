package array;

import java.util.Scanner;

public class arrayt1 {
    public static void main(String[] args) {
        int[] numbers= new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요 ");
        for( int i =0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("출력");

        for(int j = 0 ; j< numbers.length; j++ ){
            System.out.print(numbers[j]);
            if(j < numbers.length-1) {
                System.out.print(", ");
            }



        }
    }
}
