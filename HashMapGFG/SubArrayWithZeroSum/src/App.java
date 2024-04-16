import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 4, -3, 2, 1 };
        System.out.println(isSubArray2(a));
        System.out.println(isSubArray(a));

    }

    static boolean isSubArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < a.length; j++) {
                curr_sum += a[j];
                if (curr_sum == 0)
                    return true;

            }
        }
        return false;
    }

    static boolean isSubArray2(int a[]) {
        int prefix_sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            prefix_sum += a[i];
            if (set.contains(prefix_sum))
                return true;

            if (prefix_sum == 0)
                return true;
            set.add(prefix_sum);
        }
        return false;
    }
}
