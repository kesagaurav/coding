public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 1, 2, 3, 2, 4, 5, 3, 4 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(indiceArray(a[i], 0, 3));

        }
    }

    static int[] indiceArray(int a[], int x, int idx, int fsf) {
        if (idx == a.length) {
            return new int[fsf];
        }
        if (a[idx] == x) {
            int[] iarr = indiceArray(a, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = indiceArray(a, x, idx, fsf);
            return iarr;
        }
    }
}
