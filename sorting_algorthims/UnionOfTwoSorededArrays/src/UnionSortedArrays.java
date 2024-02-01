public class UnionSortedArrays {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, Gaurav!");
        int a[] = { 3, 5, 8 };
        int b[] = { 2, 8, 9, 10, 15 };
        int c[] = new int[a.length + b.length];
        // naive solution
        // for (int i = 0; i < a.length; i++) {
        // c[i] = a[i];
        // for (int j = 0; j < b.length; j++) {
        // c[a.length + j] = b[j];
        // }

        // }
        // Arrays.sort(c);
        // for (int k = 0; k < a.length + b.length; k++) {
        // if (k > 0 && c[k] == c[k - 1]) {
        // continue;
        // }
        // System.out.println(c[k]);
        // }

        // efficient solon
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                System.out.println(b[j]);
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;

            }
            while (i < a.length) {
                if (i > 0 && a[i] != a[i - 1]) {
                    System.out.println(a[i]);
                    i++;
                }

            }
            while (j < b.length) {
                if (j > 0 && b[j] != b[j - 1]) {
                    System.out.println(b[j]);
                    j++;
                }

            }

        }
    }
}