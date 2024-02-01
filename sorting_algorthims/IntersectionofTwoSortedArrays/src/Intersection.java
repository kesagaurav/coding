public class Intersection {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 1, 2, 3, 3, 2, 4 };
        int b[] = { 3, 2, 2, 3, 5, 6, 7 };

        // for (int i = 0; i < a.length; i++) {
        // if (i > 0 && a[i] == a[i - 1]) {
        // continue;
        // }
        // for (int j = 0; j < b.length; j++) {
        // if (a[i] == b[j]) {
        // System.out.println(a[i]);
        // break;
        // }
        // }

        // }

        // efficient soln
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            if (a[i] < b[j]) {

                i++;
            }
            if (a[i] > b[j]) {

                j++;
            }
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            }

        }

    }
}
