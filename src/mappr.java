import java.util.List;
import java.util.Arrays;

public class mappr {
    public static void main(String[] args){
        String[] la = new String[]{"public","static ", "void "};
        List<String> ll = Arrays.asList(la);
        List<String> ul = ll.stream()
                .map(value -> value.toUpperCase()).toList();
        ul.stream().forEach(value -> System.out.println(value));


    }


}
