import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Strampr {
    public static void main(String[] args )
    {
        List<Student> list = Arrays.asList(
        new Student("홍길동 " ,90),
        new Student("김수영 ", 25)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int score =s.getScore();
            System.out.println(name + "- " + score );
        });

    }


}
