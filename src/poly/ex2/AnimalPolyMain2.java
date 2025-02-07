package poly.ex2;

import poly.ex1.Animal;
import poly.ex1.Cat;
import poly.ex1.Cow;
import poly.ex1.Dog;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        poly.ex1.Dog dog = new Dog();
        poly.ex1.Cow cow = new Cow();
        poly.ex1.Cat cat = new Cat();

        poly.ex1.Animal[] animalsArrays = {dog,cat,cow};

        for (poly.ex1.Animal animalsArray : animalsArrays) {
            System.out.println("동물 소리 테스트 시작" );
            animalsArray.sound();
            System.out.println("동물 소리 테스트 종료");

        }
    }


    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작" );
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
