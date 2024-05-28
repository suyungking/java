
import java.util.List;
import java.util.ArrayList;
public class listpr {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("JDBC");
        list.add("abc");
        list.add(2,"123");
        list.add("4");

        int size = list.size();

    }
}
