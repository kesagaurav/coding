public class App {
    public static void main(String[] args) throws Exception {
        int arr1[] = { 0, 1, 0, 0, 0, 0 };
        int arr2[] = { 1, 0, 1, 0, 0, 1 };
        int n = arr1.length;
        System.out.println(maxLength(arr1, arr2));
        System.out.println(longestCommonSum(arr1, arr2, n));

    }

    static int maxLength(int a[], int b[]) {
        int sum1 = 0, sum2 = 0, res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum1 += a[i];
                sum2 += b[j];
                if (sum1 == sum2)
                    res = Math.max(res, j - i + 1);

            }
        }
        return res;
    }

    static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        // Find difference between the two
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = arr1[i] - arr2[i];

        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<>();

        int sum = 0; // Initialize sum of elements
        int max_len = 0; // Initialize result

        // Traverse through the given array
        for (int i = 0; i < n; i++) {
            // Add current element to sum
            sum += arr[i];

            // To handle sum=0 at last index
            if (sum == 0)
                max_len = i + 1;

            // If this sum is seen before,
            // then update max_len if required
            if (hM.containsKey(sum))
                max_len = Math.max(max_len, i - hM.get(sum));

            else // Else put this sum in hash table
                hM.put(sum, i);
        }
        return max_len;

    }
}
