package static2.ex;

import ref.ex.ProductOrder;

public class MathArrayUtils {


    public static int sum(int[] values){
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int temp = values[0];
        for (int value : values) {
            if(temp>value){
                temp = value;
            }
        }

        return temp;

    }

    public static int max(int[] values) {
        int temp = values[0];
        for (int value : values) {
            if(temp < value){
                temp = value;
            }
        }

        return temp;
    }
}
