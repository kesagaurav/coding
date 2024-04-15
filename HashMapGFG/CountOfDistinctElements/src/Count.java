import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Count {
    public static void main(String[] args) throws Exception {
        int a[] = { 15, 12, 13, 18, 18 };
        Arrays.asList(a);
        System.out.println(a);
        System.out.println(count(a));
        System.out.println(count2(a));
        System.out.println(count3(a));

    }

    static int count(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                c++;
            }

        }
        return c;
    }

    // using efficient solution
    static int count2(int a[]) {
        int c = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        // System.out.println(set);
        return set.size();
    }

    static int count3(int a[]) {
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(map);
        return map.size();
    }

    // static int count4(int a[]) {
    // // int c = 0;
    // // HashSet<Integer> set = new HashSet<>(Arrays.asList(a));

    // return set.size();
    // }
}
