package oop1;

public class ValueData {
    int value;

    // 매서드는 객체를 생성해야 호출할 수 있ㄲ다. 그런데 static이 붙으면 객체를 생성하지 않고도 메서드를 호출할수 있다.
    void add(){
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
