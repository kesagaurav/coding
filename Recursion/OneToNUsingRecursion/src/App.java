public class App {
    public static void main(String[] args) throws Exception {
        OnetoN(5);
    }

    static void OnetoN(int a) {
        if (a == 0)
            return;
        OnetoN(a - 1);
        System.out.println(a + " ");
    }
}
