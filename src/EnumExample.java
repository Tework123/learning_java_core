public class EnumExample {


    public static void main(String[] args) {

        Animal animal = Animal.DOG;
        Summer summer = Summer.SUMMER;
        summer.getTranslation();
        System.out.println(summer.name());


        if (animal == Animal.DOG) {
            System.out.println("dog");
        } else if (animal == Animal.CAT) {
            System.out.println("cat");

        }
    }
}



