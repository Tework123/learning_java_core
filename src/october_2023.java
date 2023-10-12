import java.util.Objects;
import java.util.Scanner;

public class october_2023 {
    public static void main(String[] args) {
//         print
        System.out.println("hello world");

//        digital
        int x = 123;
        short y = 12312;
        long z = 123;
        double g = 235.3;
        float h = 123.523f;


        char c = 'a';
        boolean b = false;
        byte myByte = 127;

//        s - объект класса string
        String s = "привет";
        String s2 = "Данила";
        String sumString = s + s2;


        int startValue = 0;

//        while (startValue < 5) {
//            startValue += 1;
//            System.out.println(startValue + "dwan");
//
//        }

//        for (int i = 10; i >= 0; i -= 1) {
//            System.out.println("hel"+ i);
//
//        }
//        for (int i = 0; i < 10; i += 1) {
//            if (i < 5) {
//                System.out.println(i);
//            } else if (i < 7) {
//                System.out.println(i + 100);
//            } else if (i < 8) {
//                System.out.println(i + 1000);
//            } else {
//                System.out.println("I end this");
//            }
//        }

//        😃
//        int numberOne = 100;
//        for (int i = 0; i < 12; i += 1) {
//            System.out.println("start first circle");
//            for (int j = 0; j < 3; j += 1) {
//                numberOne += 1;
//                System.out.println(numberOne);
//            }
//            if (numberOne > 120) {
//                System.out.println("number more чем 120");
//            }
//
//        }

//        String s3 = new String("newString");
//
//        Scanner scanner0 = new Scanner(System.in);
//        System.out.println("введите цифру");
//        String myString = scanner0.nextLine();
//        String myInt = scanner0.nextLine();
//        System.out.println(myInt+myString);
        int value;
        do {
            Scanner scanner0 = new Scanner(System.in);
            value = scanner0.nextInt();

        } while (value < 5); {
                System.out.println("Больше 5 походу");
            }


    }
}




