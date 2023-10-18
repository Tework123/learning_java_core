package Interfaces;

public class Person implements Info {
    public String name;
    public int id;


    //   это конструктор
    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello men");
    }

    @Override
    public void showInfo() {
        System.out.println("ID" + this.name);
    }

    @Override
    public int getId() {

        return id;
    }
}
