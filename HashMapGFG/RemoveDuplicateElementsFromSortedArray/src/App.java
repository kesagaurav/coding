import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 2, 2, 2, 2 };
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : a) {
            set.add(integer);
        }
        System.out.println(set);
        int a1[] = { 1, 2, 3, 4, 3, 5 };
        System.out.println(repeatingElement(a1));
        System.out.println(repeatingElement2(a1));
        int arr[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
        System.out.println(repeatingElement2(arr));
        int arr1[] = { 20, 30, 20, 10, 10, 10 };
        System.out.println(countDistinct(arr1));
        String s = "gaurav";
        frequencyOfEachCharacter(s);

    }

    static int repeatingElement(int a[]) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    return a[i];

            }
        }
        return -1;

    }

    static int repeatingElement2(int a[]) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[i + 1]) {
                return a[i];
            }
        }
        return -1;

    }

    static int repeatingElement3(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return a[i];
            } else {
                set.add(a[i]);
            }
        }
        return -1;

    }

    static int countDistinct(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i]))
                c++;
            else
                set.add(a[i]);

        }
        System.out.println(set);
        return c;
    }

    static void frequencyOfEachCharacter(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);

        }
        for (Map.Entry<Character, Integer> cmap : hm.entrySet()) {
            System.out.println(cmap.getKey() + " " + cmap.getValue());
        }
    }
}
