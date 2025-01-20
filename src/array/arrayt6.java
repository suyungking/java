package array;

import java.util.Scanner;

public class arrayt6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int number = sc.nextInt();
        String[] sub = {"국어","수학","영어"};
        int[][] score = new int[number][sub.length];

        for(int i =0; i<score.length; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");

            for (int j=0; j<sub.length; j++){
                System.out.print(sub[j]+" 점수 : ");
                score[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<score.length; i++){
            int sum = 0;

            for (int j=0; j< sub.length; j++){
                sum += score[i][j];


            }
            double aver = (double) sum / sub.length;
            System.out.println((i+1)+"번 학생의 총점 : "+ sum + " 평균 : "+ aver);
        }


    }
}
