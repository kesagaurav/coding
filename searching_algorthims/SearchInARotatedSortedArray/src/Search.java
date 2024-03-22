public class Search {
    public static void main(String[] args) throws Exception {
        int arr[] = { 100, 200, 400, 1000, 10, 20 }, n = 6;

        int x = 10;

        System.out.println(search(arr, n, x));
    }

    // naive sol^n
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++)
            if (arr[i] == x)
                return i;

        return -1;
    }

    static int search1(int arr[], int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[low] <= arr[mid]) {
                if (x >= arr[low] && x < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (x > arr[mid] && x <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

}
