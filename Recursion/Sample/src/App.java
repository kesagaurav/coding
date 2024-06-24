public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        sample(6);
    }

    static void sample(int a) {
        if (a == 6) {
            return;
        }
        sample(a - 1);
    }
}
