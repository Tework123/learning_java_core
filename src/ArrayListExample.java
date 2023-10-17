import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
//        ArrayList<Integer> cars = new ArrayList<Integer>(A);
//        cars.add(1);
//        cars.add(2);
//
//        System.out.println(cars);
//
//        for (Integer str : cars) {
//            System.out.println(str);
//
//        }


        Scanner sc = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();

        String[] myStr = new String[6];
        String x = "he llo llo as";

        for (int i = 0; i < 1; i++) {
            myStr = x.split(" ");
//            myStr[i] = "1";
            System.out.println(Arrays.toString(myStr));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(myStr[i]);
        }
    }
}
