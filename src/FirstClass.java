import java.time.Period;
import java.util.Date;

public class FirstClass {
    public static void main(String[] args) {
        People danila = new People("Danila", 22);
        danila.setAge(23);
        System.out.println(danila.getAge());
        System.out.println(danila.getName());
        People.text = "123";
        System.out.println(People.getText());
        People.getDate();
        People nikita = new People("Nikita", 18);
        System.out.println(People.countPeople);


    }
}

class People {
    private String name;
    private int age;
    public static String text;
    public static final double CONSTANT = 3.14;
    public static int countPeople;

    public static String getText() {
        return text;
    }

    public static void getDate() {
        System.out.println("Вывожу время");
        Date date = new Date();
        System.out.println(date);

    }

    public People(String name, int age) {
        System.out.println("ПРИУВЕТ");
        this.name = name;
        this.age = age;
        countPeople += 1;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Ты еще не родился");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}




