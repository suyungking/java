package method;

public class methodt1 {
    public static void main(String[] args) {
        String message = "Hello world!";
        fs(message,3);
        fs(message,5);
        fs(message,7);
    }

    public static void fs(String message,int times ) {
        for(int i =0; i<times; i++){
            System.out.println(message);
        }
    }
}
