public class DigistsInNumber {
    public static void main(String[] args) {
        int n = 10;
        double d = (n * Math.log10(n / Math.E) + Math.log10(n * 2 * Math.PI) / 2.0);

        int n1 = 4;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0)
                System.out.println(i);
        }
    }
}