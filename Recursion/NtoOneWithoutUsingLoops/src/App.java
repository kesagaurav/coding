public class App {
    public static void main(String[] args) throws Exception {
        NtoOne(5);
    }

    static void NtoOne(int a) {
        if (a == 0)
            return;

        System.out.println(a + " ");
        NtoOne(a - 1);
    }
}
