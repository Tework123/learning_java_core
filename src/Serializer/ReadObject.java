package Serializer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int personCount = ois.readInt();
        Person[] peoples = new Person[personCount];
        for (int i = 0; i < personCount; i++) {
            peoples[i] = (Person) ois.readObject();
        }
        Person[] peoples2 = (Person[]) ois.readObject();
        for (Person people : peoples2) {
            System.out.println(people + " list");

        }
        System.out.println("only one object end");


        for (Person people : peoples) {
            System.out.println(people + " list");
        }

        Person person1 = (Person) ois.readObject();
        Person person2 = (Person) ois.readObject();
        System.out.println(person1 + " " + person2);
        ois.close();

    }
}
