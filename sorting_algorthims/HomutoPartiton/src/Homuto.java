public class Homuto {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[] { 5, 3, 8, 4, 2, 7, 1, 10 };

        int n = arr.length;
        // partition(arr, 0, n - 1);
        quickSort(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }

    static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void quickSort(int a[], int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quickSort(a, l, p);
            quickSort(a, p + 1, h);
        }
    }

}
