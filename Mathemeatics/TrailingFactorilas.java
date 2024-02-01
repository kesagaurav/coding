package Mathemeatics;

public class TrailingFactorilas {
    public static void main(String[] args) {
        int n = 10;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
            System.out.println(res);
        }
        int c = 0;
        while (res % 10 == 0) {
            c++;
            res /= 10;
        }
        System.out.println(c);

        // efficient appraocah
        int res1 = 0;
        int n1 = 251;
        for (int i = 5; i <= n1; i *= 5) {
            res1 += n1 / i;
            System.out.println(res);
        }
    }
}
