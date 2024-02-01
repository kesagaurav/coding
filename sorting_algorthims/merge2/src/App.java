public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void merge(int a[], int low, int high, int mid) {
        int n1 = low - mid + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int merge[] = new int[left.length + right.length];

        for (int i = 0; i < n1; i++) {
            left[i] = a[low + i];
        }
        for (int j = 0; j < n2; j++) {
            merge[j + 1 + mid] = a[j];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && i < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
        }
        while (i < a.length) {
            a[k] = left[i];
            i++;
        }

        while (j < a.length) {
            a[k] = left[j];
            j++;
        }

    }
}
