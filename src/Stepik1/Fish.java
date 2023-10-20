package Stepik1;

final public class Fish extends Animal {

    boolean isSwim = true;
    String squama;
    boolean upStreamSwim;

    public Fish(String name, String type) {
        super(name, type);
    }

    public void display() {
        super.display();
        System.out.println("squama: " + this.squama);
        System.out.println("upStreamSwim: " + this.upStreamSwim);
    }

    void bul_bul() {
        System.out.println("bul_bul");

    }


}
