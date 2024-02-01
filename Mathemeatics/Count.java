package Mathemeatics;

public class Count {
    public static void main(String[] args) {
        System.out.println(count(344));
    }

    public static int count(int x) {
        int res = 0;
        while (x > 0) {
            x /= 10;
            res++;
        }
        return res;
    }
}
