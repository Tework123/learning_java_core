package Serializer;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "bob");
        Person person2 = new Person(2, "den");
        Person[] peoples = {new Person(1, "bob"), new Person(2, "den"),
                new Person(3, "kola")};

        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//      write with loop
        oos.writeInt(peoples.length);
        for (Person person : peoples) {
            oos.writeObject(person);
        }

//      write one [] object without loop
        oos.writeObject(peoples);
        oos.writeObject(person1);
        oos.writeObject(person2);
        oos.close();

    }
}
