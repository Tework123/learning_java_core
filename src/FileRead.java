import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
//         full path
        String path = separator + "home" + separator + "t1" + separator + "dateout.txt";

//        file in project
        String path2 = "example.txt";
        File file = new File(path2);
        Scanner sc = new Scanner(file);

        File fileWrite = new File("example.txt");
        PrintWriter pw = new PrintWriter(fileWrite);
        pw.println("helloMen");
        pw.println("gsfsd");
        pw.close();

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] array = input.split("");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        sc.close();
    }
}
