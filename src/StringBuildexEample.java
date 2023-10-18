public class StringBuildexEample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append("LLL").append("ds");
        System.out.println(sb);

        System.out.printf("HEELo %s %10d", "123", 3+1);
    }
}
