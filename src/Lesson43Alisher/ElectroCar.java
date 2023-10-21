package Lesson43Alisher;

public class ElectroCar {
    private int id;

    private class Motor {
        public void startMotor() {
            System.out.println("motor");
        }
    }

    public static class Battery {
        public void charge() {
            System.out.println("battery");
        }
    }

    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        final int x = 1;
        class SomeClass {
            public void someMethod() {
                System.out.println(x);

            }
        }
        SomeClass someCl = new SomeClass();
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("START");
    }

}
