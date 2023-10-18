package OOP.ExtendsFirst;

public class MainForAnimal {
    public static void main(String[] args) {
        Dog Rex = new Dog();
        Rex.eat();
        Rex.sleep();
        Rex.bark();
        Rex.name = "Vasya";
        System.out.println(Rex.name);

    }
}
