package method;

public class methodover4 {
    // 오버로딩 : 같은 이름의 메서드를 여러개 정의했다

    // 규칙 : 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있디ㅏ. 반환 타입은 인정하지 않는다
    public static void main(String[] args) {
        System.out.println("1 : " + add(1,2));
        System.out.println("2 : " + add(1,2,3));
    }

    public static int add(int a, int b ){
        System.out.println(("1번 호출 "));
        return a+b;
    }

    public static int add(int a, int b , int c){
        System.out.println(("2번 호출 "));
        return a+b+c;
    }
}
