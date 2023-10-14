public class Arrays {
    public static void main(String[] args) {
//        int[] numbers = new int[10];

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i * 2;
//        }
//
//        int[] numbers2 = {1, 23, 455, 2};
//        for (int j : numbers2) {
//            System.out.println(j);
//        }

//        String[] strings = new String[3];
//        strings[0] = "Hello";
//
//        String[] strings2 = {"hello", "hello2"};
//
//
//        for (String string : strings2) {
//            System.out.println(string);
//        }

//        char[][] chars = {{'a', 'b', 'c'}, {'d'}, {'g', 'h'}};
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i][0]);
//        }

//        String[][][] strings = new String[1][3][5];
//        char[][][] chars = {{{'a', 'a', 'a'}}, {{'b'}, {'b', 'b'}}, {{'c', 'c'}}, {{'d'}, {'d'}}};
//        в первом массиве 2 массива, в каждом из них еще по 3 массива, в каждом из них по 4 элемента
//        char[][][] chars = new char[2][3][4];

//        for (int i = 0; i < chars.length; i++) {
//            System.out.println("i start");
//            System.out.println(java.util.Arrays.deepToString(chars[i]));

//            for (int j = 0; j < chars[i].length; j++) {
//                System.out.println("j start");
//                System.out.println(chars[i][j]);
//
//                for (int k = 0; k < chars[i][j].length; k++) {
//                    System.out.println("k start");
//                    System.out.println(chars[i][j][k]);
//                }
//
//            }
//        }


        int n = 5;
        int m = 6;
        // пример заполнения
        int[][][] mas = new int[2][3][4];

        mas[1] = new int[][]{};

        //пример вывода
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < mas[i].length; j++) //length
                for (int k = 0; k < mas[i][j].length; k++) {
                    System.out.println(mas[i][j][k]);

                }
        }
    }
}

