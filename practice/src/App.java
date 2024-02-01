public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int b[] = { 1, 2, 3 };
        // System.out.println(max(b));
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }
    }

    // public static int max(int a[]) {
    // int lag = a[0];
    // if (lag > 0) {
    // lag = max(a);
    // }
    // return lag;
    // }
}
