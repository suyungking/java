package array;

public class arrayt {
    public static void main(String[] args) {
        int[] score = {90,80,70,60,50};

        int sum = 0;


        for(int i=0; i<score.length; i++){
            sum += score[i];
        }
        double average = (double) sum / score.length ;

        System.out.println("점수 총합 " + sum);
        System.out.println("점수 평균 " + average);
    }
}
