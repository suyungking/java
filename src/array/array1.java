package array;

import java.util.List;

public class array1 {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5}; // 값의 목록을 가지고 있을때
        int[] array2 = new int[5]; // 값의 목록을 가지고 있지 않을때

        array2[0] = 2;

        System.out.println(array1[1]);
        System.out.println(array2[0]);

    }
}
