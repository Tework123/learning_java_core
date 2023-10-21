public class Recursia {
    public static void main(String[] args) {
        long x = someMethod(5);
        System.out.println(x);

    }

    private static long someMethod(long n) {
        if (n <= 1) {
            return 1;
        }
        return someMethod(n-2) + someMethod(n - 1);


    }
}
