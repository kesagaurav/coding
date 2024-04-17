import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 1, 3, 6, -2, -1, -3, 2, 7 };
        System.out.println(findPairs(a));

    }

    static ArrayList<Integer> findPairs(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < a.length; i++) {
            int posneg = Math.abs([i]);
            if (set.contains(-a[i])) {
                list.add(-posneg);
                list.add(posneg);
            } else
                set.add(a[i]);

        }
        return list;
    }
}
