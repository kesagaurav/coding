public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 5, 10, 10, 10, 10, 20, 20 }, n = 7;

        int x = 10;

        System.out.println(lastOccurence(arr, 0, arr.length - 1, x, n));
    }

    private static int lastOccurence(int arr[], int low, int high, int x, int n) {

        if (low > high)
            return -1;
        int mid = low + high / 2;
        if (x > arr[mid])
            return lastOccurence(arr, mid + 1, high, x, n);

        else if (x < arr[mid])
            return lastOccurence(arr, low, mid - 1, x, n);

        else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid])
                return mid;

            else
                return lastOccurence(arr, mid + 1, high, x, n);
        }

    }

    // iterative binaryseacrh
    private static int lastOccurenceIterative(int arr[], int low, int high, int x) {
        low = 0;
        high = arr.length - 1;
        if (low > high)
            return -1;
        while (low <= high) {
            int mid = low + high / 2;
            if (x > arr[mid]) {
                high = mid - 1;
            } else if (mid != arr.length - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                low = mid + 1;

            }
        }
        return -1;

    }

}
