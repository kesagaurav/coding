public class FirstAndLastOccurence {
    public static void main(String[] args) throws Exception {
        int arr[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
        System.out.println(firstAndLast(arr, 8));
        // first occurence
        System.out.println(lowerBound(arr, 8));
        // last occurence
        System.out.println(upperBound(arr, 8) - 1);

    }

    // naive solution
    public static int firstAndLast(int arr[], int x) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || first == -1) {
                first = i;
                continue;
            } else {
                last = i;

            }
        }
        return -1;
    }

    // optimised solution
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
}
