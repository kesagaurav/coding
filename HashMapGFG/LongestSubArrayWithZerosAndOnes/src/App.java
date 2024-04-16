import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 1, 1, 1, 0, 1, 0 };
        System.out.println(subArrayZeroAndOne(a));
        System.out.println(largestZeroSubarray(a, 6));
    }

    static int subArrayZeroAndOne(int a[]) {
        int c0 = 0, c1 = 0, res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] == 0)
                    c0++;
                else
                    c1++;

                if (c0 == c1)
                    res = Math.max(res, c0 + c1);

            }
        }
        return res;
    }

    static int largestZeroSubarray(int arr[], int n) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                maxLen = i + 1;

            if (hm.containsKey(sum + n) == true) {
                if (maxLen < i - hm.get(sum + n))
                    maxLen = i - hm.get(sum + n);

            } else
                hm.put(sum + n, i);
        }
        return maxLen;
    }
}
