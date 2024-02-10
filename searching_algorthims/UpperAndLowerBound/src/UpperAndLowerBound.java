public class UpperAndLowerBound {
    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        System.out.println(lowerBound(arr, 9));
        int arr1[] = { 2, 3, 6, 7, 8, 8, 11, 11, 11, 12 };

        System.out.println(upperBound(arr1, 6));

        int arr3[] = { 1, 2, 4, 7 };
        System.out.println(searchInsertPosition(arr3, 6));

    }

    public static int lowerBound(int arr[], int x) {
        int l = 0, high = arr.length - 1, ans = arr.length;
        while (l <= high) {
            int mid = (l + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int arr[], int x) {
        int l = 0, high = arr.length - 1, ans = arr.length;
        while (l <= high) {
            int mid = (l + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    // search insertion position
    public static int searchInsertPosition(int arr[], int x) {
        int l = 0, high = arr.length - 1, ans = arr.length;
        while (l <= high) {
            int mid = (l + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
