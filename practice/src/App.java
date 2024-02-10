import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int b[] = { 1, 2, 3 };
        // // System.out.println(max(b));
        // for (int i = b.length - 1; i >= 0; i--) {
        // System.out.println(b[i]);
        // }

        String s = "gaurav";
        Map<Character, Integer> hmap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> hmap1 : hmap.entrySet()) {
            System.out.println(hmap1.getKey() + "  " + " " + hmap1.getValue());

        }

        String s1 = "geeksforgeeks";
        HashSet<Character> set = new HashSet<>();
        int min_idx = Integer.MAX_VALUE;
        int n = s1.length();
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(s.charAt(i))) {
                min_idx = i;
            } else {
                set.add(s.charAt(i));
            }
        }
        System.out.println(set);

    }

    // public static int max(int a[]) {
    // int lag = a[0];
    // if (lag > 0) {
    // lag = max(a);
    // }
    // return lag;
    // }
}
