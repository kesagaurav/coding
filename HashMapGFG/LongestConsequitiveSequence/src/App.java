import java.util.Arrays;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 1, 9, 3, 4, 2, 20 };
        System.out.println(LongestConsequitiveSeq(a));
        int a2[] = { 2, 6, 1, 9, 4, 5, 3 };
        System.out.println(subSequence(a2));
    }

    static int LongestConsequitiveSeq(int a[]) {
        Arrays.sort(a);
        int res = 1, curr = 1;
        // System.out.println(a.toString());
        // for (int num : a) {
        // System.out.println(num);
        // }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1) {
                curr++;
            } else if (a[i] != a[i - 1]) {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        return Math.max(res, curr);
    }

    static int subSequence(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int res = 1;
        for (Integer x : set) {
            if (set.contains(x - 1) == false) {
                int curr = 1;
                while (set.contains(x + curr)) {
                    curr++;
                    res = Math.max(res, curr);
                }

            }
        }
        return res;

    }
}
