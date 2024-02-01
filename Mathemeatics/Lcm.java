package Mathemeatics;

public class Lcm {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int max = Math.max(a, b);
        int c = 0;
        while (true) {
            if (max % a == 0 || max % b == 0) {
                System.out.println(max);
                c++;
            }
        }
        // System.out.println(max);
        Math.abs(max);
    }
}
