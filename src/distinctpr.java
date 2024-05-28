import java.util.List;
import java.util.Arrays;
public class distinctpr {
    public static void main(String[] args ){
        Integer[] intgerar = new Integer[]{1,1,1,1,2,2,2,3,3,4};
        List<Integer> list = Arrays.asList(intgerar);
        List<Integer> distinctList = list.stream().distinct().toList();
        distinctList.stream().forEach(value -> System.out.println(value));

    }
}
