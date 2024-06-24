public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 1, 2, 3, 2, 4, 5, 3, 4 };
        System.out.println(LastOcurr(a, 0, 4));
    }

    static int LastOcurr(int a[], int idx, int x) {
        if (idx == a.length) {
            return -1;
        }
        int l = LastOcurr(a, idx + 1, x);
        if (l == -1) {
            if (a[idx] == x) {
                return idx;
            } else {

                return -1;
            }
        } else {
            return l;
        }
    }
}
