import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 1, 5, 3, 4, 3, 5, 6 };
        System.out.println(firstRepeated(a));
    }

    static int firstRepeated(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (set.contains(a[i])) {
                ans = i + 1;
            } else {
                set.add(a[i]);
            }
        }
        return ans;
    }
}
