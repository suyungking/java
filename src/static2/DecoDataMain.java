package static2;


//import static static2.DecoData.staticCall;
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("1.정적 호출 : " );
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2.인스턴스 호출 1: ");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("2.인스턴스 호출 1: ");
        DecoData data2 = new DecoData();
        data2.instanceCall();


//        DecoData.staticCall(data1);
//        DecoData.staticCall(data2);
//        DecoData.staticCall(data2);
    }


    }
