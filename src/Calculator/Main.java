package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = getResult(input);
        System.out.println(result);
    }

    public static int getResult(String input) {
        String[] inputArray = input.split(" ");
        int a = 0;

        try {
            a = Integer.parseInt(inputArray[0]);
        } catch (Exception e) {
            System.out.println("Error! Not number " + e);

        }
        int result = a;
        int b = 0;

        String sign = "";
        for (int i = 1; i < inputArray.length; i += 2) {
            sign = inputArray[i];
            try {
                b = Integer.parseInt(inputArray[i + 1]);

            } catch (Exception e) {
                System.out.println("Error! Not number " + e);
            }

            switch (sign) {
                case "+":
                    result += b;

                    break;
                case "-":
                    result -= b;

                    break;
                case "/":
                    try {
                        result /= b;
                    } catch (Exception e) {
                        System.out.println("Error! Division by zero " + e);
                        throw new java.lang.Error("this is very bad");
                    }

                    break;
                case "*":
                    result *= b;

                    break;
                default:

                    System.out.println("Operation Error!");
                    break;
            }

        }


        return result;
    }
}
