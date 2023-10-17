public class MathLearning {
    public static void main(String[] args) {

        System.out.println(Math.abs(-1));
        System.out.println(Math.pow(12, 2));      // 144.0
        System.out.println(Math.sqrt(121));      // 11.0
        System.out.println(Math.random());      // 1

        int x = randomInARange(0, 101);
        System.out.println(x);
        System.out.println("**************");

        long startTime = System.nanoTime();
        long summ = 0L;
        long end = 10000000000L;
//        9223372036854775807
        for (long i = 0L; i < end; i++) {
            summ += i;
        }
        System.out.println(summ);

        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000000);
        System.out.println((endTime - startTime));

    }

    static int randomInARange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
