import java.io.IOException;
import java.util.Scanner;

public class ExeptionsExample {
    public static void main(String[] args) throws IOException, ScannerException {
        Scanner sc = new Scanner(System.in);

        String name = null;
        name.toLowerCase();
        System.out.println(name);


        while (true) {
            int x = Integer.parseInt(sc.nextLine());
            if (x == 0) {
                throw new ScannerException("don't work sorry");
            } else {
                System.out.println(x);
            }
        }
    }
}
