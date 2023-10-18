public class ObjectExample {
    public static void main(String[] args) {
        People2 p2 = new People2("bob", 32);
        String hash = p2.toString();
        System.out.println(hash);
    }
}

class People2 {
    String name;
    int age;

    public People2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+", "+age;
    }
}