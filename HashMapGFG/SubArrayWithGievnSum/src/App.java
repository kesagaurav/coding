import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 5, 8, 6, 13, 3, -1 };
        int sum = 22;
        System.out.println(isSum(a, sum));
        System.out.println(isSubArray2(a, sum));

    }

    static boolean isSum(int a[], int sum) {
        for (int i = 0; i < a.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < a.length; j++) {
                curr_sum += a[j];
                if (curr_sum == sum)
                    return true;
            }
        }
        return false;
    }

    static boolean isSubArray2(int a[], int sum) {
        int prefix_sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            prefix_sum += a[i];
            if (set.contains(prefix_sum - sum))
                return true;

            if (prefix_sum == sum)
                return true;
            set.add(prefix_sum);
        }
        return false;
    }
}
