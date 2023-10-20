package Stepik1;

public class Insect extends Animal implements BreakWings, FreezeInter {
    boolean isWalk = true;
    String wingCount;
    String likeJesus;

    public Insect(String name, String type) {
        super(name, type);
    }

    public void display() {
        super.display();
        System.out.println("isFly: " + this.isFly);
        System.out.println("wingCount: " + this.wingCount);
        System.out.println("likeJesus: " + this.likeJesus);
    }

    void Ggggg() {
        System.out.println("Ggggg");

    }

    public void Fly() {

    }

    public void freeze() {
    }


    @Override
    public void breakWings() {

    }
}
