package Stepik1;

public class Bird extends Animal implements FlyInter{
    boolean isFly = true;
    String area;
    boolean winterFly;

    public Bird(String name, String type) {
        super(name, type);
    }

    public void display() {
        super.display();
        System.out.println("isFly: " + this.isFly);
        System.out.println("area: " + this.area);
        System.out.println("winterFly: " + this.winterFly);


    }

    void chirik_chirik() {
        System.out.println("chirik_chirik");

    }

    public void Fly() {

    }

}
