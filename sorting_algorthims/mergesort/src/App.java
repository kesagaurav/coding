import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 5, 6, 7 };
        int b[] = { 1, 2, 3 };
        merge(a, b);
        System.out.println("---- the merge 2 ------");
        merge2(a, b);

    }

    public static void merge(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];
        }
        Arrays.sort(c);

        for (int k = 0; k < a.length + b.length; k++) {
            System.out.println(c[k]);
        }
    }

    // efficeint solon for merge sort
    public static void merge2(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {
                System.out.println(a[i]);
                i++;

            } else {
                System.out.println(b[j]);
                j++;
            }
            while (i < a.length) {
                System.out.println(a[i]);
                i++;
            }
            while (j < b.length) {
                System.out.println(b[j]);
                j++;
            }
        }

    }
}
