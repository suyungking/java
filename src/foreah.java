import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class foreah {
    public static void main(String[] args ){
        Integer[] inar = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(inar);
        List evenlist = list.stream()
                        .filter(value -> value % 2 ==0).collect(Collectors.toList());
        evenlist.stream().forEach(value -> System.out.println(value));
    }

}
