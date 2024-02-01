public class Naive {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[] { 5, 13, 6, 9, 12, 11, 8 };

        int n = arr.length;
        naivePartition(arr, 0, n - 1, n - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void naivePartition(int ar[], int l, int h, int p) {
        int temp[] = new int[h - l + 1], index = 0;
        for (int i = l; i <= h; i++)
            if (ar[i] <= ar[p]) {
                temp[index] = ar[i];
                index++;
            }

        for (int i = l; i <= h; i++)
            if (ar[i] > ar[p]) {
                temp[index] = ar[i];
                index++;
            }

        for (int i = l; i <= h; i++) {
            ar[i] = temp[i - l];
        }

    }
}