package scope;

public class scope3_2 {
    public static void main(String[] args){
        int m = 10;
        if( m > 0){

            int temp = m*2;  // if문 안에서 사용하는 지역변수구나 라는것을 알수있다.
            System.out.println("temp = "+ temp);
        }
        System.out.println("m= " + m);

    }
    }

