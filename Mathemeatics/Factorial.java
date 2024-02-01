package Mathemeatics;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
            System.out.println(res);
        }
        System.out.println(factorial(5));
    }

    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return x * factorial(x - 1);
    }
}
