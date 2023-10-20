package Stepik1;

public abstract class Animal implements Info{
    private static int countAnimal;

    static String description;
    String type;
    String name;
    int age;
    int weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    //    инициализаторы

    static {
        description = "Animal very big";
        countAnimal += 1;
    }

    {
        name = "default";
        age = 1;
    }


    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No name";

    }

    public String toString() {
        return "Animal{"
                + "name='" + this.name + '\''
                + ", age=" + this.age
                + '}';
    }

    public void display() {
        System.out.println("I am:: " + this.getClass().getSimpleName());
        System.out.println("Type: " + this.type);
        System.out.println("Type: " + this.type);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);

    }


    void holiday() {
        this.weight += 1;
    }

    void holiday(int day) {
        this.weight += (int) (day * 0.1);
    }

    void holiday(int day, int n) {
        this.weight += (int) (day * n * 0.1);
    }

    final void rename(String name) {
        this.name = name;

    }

    static void getCountAnimals() {
        System.out.println(countAnimal);
    }

}



