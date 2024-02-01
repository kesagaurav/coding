public class SegratePostiveAndNegative {
    public static void main(String[] args) {
        int a[] = { 13, -12, 18, -10 };
        // sort(a);
        Lomutosort(a);
        for (int x : a) {
            System.out.println(x + " ");
        }

    }

    static void sort(int a[]) {
        int temp[] = new int[a.length];
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] < 0) {
                temp[i] = a[j];
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] >= 0) {
                temp[j] = a[j];
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            a[j] = temp[j];
        }
    }

    static void Lomutosort(int a[]) {
        // int temp[] = new int[a.length];
        int l = 0, high = 0;
        int i = l - 1;
        high = a.length;
        for (int j = l; j <= high - 1; j++) {
            if (a[j] < 0) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        for (int j = l; j <= high - 1; j++) {
            if (a[j] >= 0) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

    }
}
