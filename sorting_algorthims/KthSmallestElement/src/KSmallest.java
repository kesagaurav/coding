import java.util.ArrayList;
import java.util.List;

public class KSmallest {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[] { 10, 4, 5, 8, 11, 6, 26 };

        int n = arr.length;
        int k = 6;
        int index = kthSmallest(arr, k);

        System.out.print(arr[index]);
    }

    public static int kthSmallest(int arr[], int k) {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int p = partition(arr, l, h);
            if (p == k - 1)
                return p;
            else if (p > k - 1)
                h = p - 1;
            else
                l = p + 1;
        }
        return -1;

    }

    public static int partition(int ar[], int l, int h) {
        List<Integer> list = new ArrayList<>();
        int pivot = ar[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (ar[j] < pivot) {
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        int temp = ar[i + 1];
        ar[i + 1] = ar[h];
        ar[h] = temp;
        return i + 1;

    }
}
