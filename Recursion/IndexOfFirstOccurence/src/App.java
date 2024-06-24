public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 1, 2, 3, 2, 4, 5, 3, 4 };
        System.out.println(firstOcurr(a, 0, 4));
    }

    static int firstOcurr(int a[], int idx, int x) {
        if (idx == a.length) {
            return -1;
        }

        if (a[idx] == x) {
            return idx;
        } else {
            int f = firstOcurr(a, idx + 1, x);
            return f;
        }
    }
}
