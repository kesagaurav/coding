import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) throws Exception {
        int a[] = { 3, 2, 8, 15, -8 };
        int target = 17;
        System.out.println(isPair(a, target));
        System.out.println(isPair2(a, target));
    }

    // naive method
    static boolean isPair(int a[], int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target)
                    return true;

            }
        }
        return false;
    }

    static boolean isPair2(int a[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(target - a[i]))
                return true;
            else
                set.add(a[i]);

        }
        return false;
    }
}
