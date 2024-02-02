public class Inversions {
    public static void main(String[] args) throws Exception {
        int arr[] = { 2, 4, 1, 3, 5 };
        // ystem.out.println(countInversions(arr));
        // for (int x : arr) {
        // System.out.println(x + " ");
        // }
        int n = arr.length;
        System.out.print(countInv(arr, 0, n - 1));

    }

    // naive
    public static int countInversions(int arr[]) {
        int res = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    res++;
                }
            }
        }
        return res;
    }
    // efficeint approach
    public static int countInv(int arr[], int l, int h) {
        int res = 0;
        if (l < h) {
            int m = l + h / 2;
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, h);
            res += merge(arr, l, h, m);
        }
        return res;
    }

    public static int merge(int a[], int low, int high, int mid) {
        int n1 = low - mid + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int merge[] = new int[left.length + right.length];

        for (int i = 0; i < n1; i++) {
            left[i] = a[low + i];
        }
        for (int j = 0; j < n2; j++) {
            a[j + 1 + mid] = a[j];
        }
        int i = 0, j = 0, k = low, res = 0;
        while (i < n1 && i < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                res = res + (n1 - i);
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
        return res;

    }

}
