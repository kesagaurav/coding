public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        arrayReverse(a, 0);
    }

    static void arrayReverse(int a[], int idx) {
        if (idx == a.length) {
            return;
        }
        arrayReverse(a, idx + 1);
        System.out.println(a[idx]);

    }
}
