import Lesson29.Animal;
import Lesson29.Dog;

import java.util.ArrayList;
import java.util.List;

public class Hello123 {

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        Dog dog = new Dog();

//         anonim classes
        Dog dog2 = new Dog() {
            public void bark(String food) {
                System.out.println("HELLLo2222222 " + food);
            }

        };
        dog2.bark("asd");
        list.add(dog);
        putList(list);

//        generics, few different classes in one
        List<Object> list2 = new ArrayList<>();
        Animal animal = new Animal();
        list2.add(animal);
        list2.add(dog);
        list2.add(123);
        putList2(list2);

    }

    static void putList(List<Animal> list) {
        for (Animal animal : list) {
            animal.eat(212);
        }
    }

    static void putList2(List<Object> list) {
        for (Object animal : list) {
            System.out.println(animal);
        }
    }
}


