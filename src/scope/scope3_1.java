package scope;

public class scope3_1 {
    public static void main(String[] args){
        int m = 10;
        int temp = 0;
        if( m > 0){
            temp = m*2;
            System.out.println("temp = "+ temp);
        }
        System.out.println("m= " + m);

    }
}// 임시 변수 temp는 if문 안에서만 사용 굳이 메인 블록내에서 선언되면 생존범위가 길어짐 temp는 if문에서 선언해서 사용하면 좋다
// 코드 복잡성이 증가함