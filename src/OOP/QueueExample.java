package OOP;

import java.util.ArrayList;

public class QueueExample {
    public static void main(String[] args) {

        Queue carQueue = new Queue();
        carQueue.put(2);
        carQueue.put(3);
        int x;
        x = carQueue.get();
        System.out.println(x);
        System.out.println(carQueue.getSizeQueue());
    }
}

class Queue {
    ArrayList<Integer> cars;

    Queue() {
        this.cars = new ArrayList<>();

    }

    void put(int element) {
        this.cars.add(element);
        System.out.println("Элемент " + element + " добавлен");

    }

    int get() {

        return this.cars.get(this.cars.size() - 1);
    }

    int getSizeQueue() {
        return this.cars.size();
    }
}





