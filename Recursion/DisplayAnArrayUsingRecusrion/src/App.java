public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 1, 2, 3, 4, 5 };
        displayArray(a, 0);
    }

    static void displayArray(int a[], int idx) {
        if (idx == a.length) {
            return;
        }
        System.out.println(a[idx]);
        displayArray(a, idx + 1);
    }
}
