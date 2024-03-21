
public class AllocateMinimumPage2 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 30 };
        int n = arr.length;
        int k = 2;

        System.out.print(minPages(arr, k));
    }

    static boolean isfeasiable(int a[], int k, int ans) {
        int req = 1, sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] + sum > ans) {
                req++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }
        return (req <= k);
    }

    static int minPages(int a[], int k) {
        int max = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            max = Integer.max(max, a[i]);
        }
        int low = max, high = sum, res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isfeasiable(a, k, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;

    }
}