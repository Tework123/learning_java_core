package Stepik1;

public class Stepik2_4 {
    public static void main(String[] args) {
        Animal rex = new Animal("ads", "ads");
        Animal rex2 = new Animal("ads", 123);

        Bird popugai = new Bird("kesha", "yellow");
        popugai.display();

//         static method
        Animal.getCountAnimals();
        System.out.println(Animal.description);


//         toString
        System.out.println(rex);

    }


}


