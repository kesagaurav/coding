public class BinarySearch {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(binarySerach(arr, 3));
    }

    static int binarySerach(int arr[], int x) {
        int l = 0, high = arr.length - 1;

        while (l <= high) {
            int mid = l + high / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // recursive binary search

    static int binarySerach(int arr[], int l, int high, int x) {
        l = 0;
        high = arr.length - 1;

        while (l <= high) {
            int mid = l + high / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binarySerach(arr, mid - 1, l, x);
            } else {
                return binarySerach(arr, mid + 1, high, x);
            }
        }
        return -1;
    }
}
