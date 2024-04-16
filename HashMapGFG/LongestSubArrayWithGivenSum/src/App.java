import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
    }

    static int maxLength(int a[], int sum) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < a.length; j++) {
                curr_sum += a[j];
                if (curr_sum == sum)
                    res = Math.max(res, i - j + 1);
            }
        }
        return res;
    }

    static int maxLenght2(int a[], int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int prefix_sum = 0;
            prefix_sum += a[i];
            if (map.containsKey(prefix_sum - sum) == false) {
                map.put(prefix_sum, i);
            }
            if (prefix_sum == sum) {
                res = i + 1;
            }
            if (map.containsKey(prefix_sum - sum)) {
                res = Math.max(res, i - map.get(prefix_sum - sum));
            }
        }
        return res;
    }
}
