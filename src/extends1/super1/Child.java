package extends1.super1;



public class Child extends Parent {
    public String Value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value);//this 생략가능 자기자신꺼
        System.out.println("super value = " + super.value);//this 생략가능 부모클르꺼
        this.hello();//this 생략가능 자기자신꺼
        super.hello(); //this 생략가능 부모클르꺼
    }
}
