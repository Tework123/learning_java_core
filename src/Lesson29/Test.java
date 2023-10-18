package Lesson29;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat(1);
        Dog dog1 = new Dog();
        dog1.eat(2);
        dog1.eat("salad");

        Cat cat1 = new Cat();
        cat1.eat(2);
        System.out.println("*****************");

        test(animal, 2);
        test(dog1, 3);
        test(cat1, 123);


    }

    public static void test(Animal animal, int x) {
        animal.eat(x);
    }
}
