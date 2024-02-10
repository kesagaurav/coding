import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 10, 10, 10, 20, 40 };
        int x = 10;
        System.out.println(firstOccurenceIndex(arr, 10));
    }

    private static int firstOccurenceIndex(int arr[], int x) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (set.contains(arr[i])) {
                set.add(arr[i]);
            } else if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // efficent code
    static int firstOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid])
                low = mid + 1;

            else if (x < arr[mid])
                high = mid - 1;

            else {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;

                else
                    high = mid - 1;
            }

        }

        return -1;
    }
}
