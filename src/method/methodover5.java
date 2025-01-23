package method;

public class methodover5 {
    public static void main(String[] args) {
        mymethod(1, 1.2);
        mymethod(1.2, 1);
    }
    public static void mymethod(int a , double b){
        System.out.println(("int a double b"));
    }

    public static void mymethod(double a , int b){
        System.out.println(("double a  int b"));
    }
}
