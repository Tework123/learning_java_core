package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("bob");

        Person person1 = new Person("hel");

//        определенные методы можем вызывать, а не все, которые класс имеет
        person1.showInfo();
        person1.sayHello();

        info2.showInfo();
        info2.getId();

    }


}
