package poly.ex5;

import poly.ex4.AbstractAnimal;
import poly.ex4.Cat;
import poly.ex4.Cow;
import poly.ex4.Dog;

public class InterfaceMain {

    public static void main(String[] args) {
        poly.ex4.Dog dog = new Dog();
        poly.ex4.Cat cat = new Cat();
        poly.ex4.Cow cow = new Cow();

        cat.sound();
        cat.move();
        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cow);
        moveAnimal(cat);
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.move();
        System.out.println("동물 소리 테스트 종료");
    }
}
