package array;

public class arrfor {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};



        // 일반 for문
        for(int i =0; i<numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
        //향샹된 for문 for-each문
        for(int number : numbers){
            System.out.println(number);
        }
        // 증가하는 index값이 필요할때 사용못함


    }
}
