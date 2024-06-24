public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int n = 5, a = 2, b = 1, c = 5;

        System.out.println(maxPeices(n, a, b, c));
    }

    static int maxPeices(int a, int b, int c, int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= -1)
            return -1;
        int res = Math.max(maxPeices(n - a, a, b, c),
                Math.max(maxPeices(n - b, a, b, c),
                        maxPeices(n - c, a, b, c)));
        if (res == -1)
            return -1;

        return res + 1;
    }
}
