import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {


        HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        for (String state : states) {

            System.out.println(state);
        }
        // удаление элемента
        states.remove("Germany");

    }
}
