package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 발생
        // null.value
        System.out.println("data = " + data.value);

    }
}
