package searching_algorthims.RepatingElementsPart1.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Repating {
    public static void main(String[] args) throws Exception {
        int a[] = { 0, 2, 3, 1, 2, 2 };
        int a1[] = { 0, 1, 2, 2, 2, 3 };
        Arrays.sort(a1);
        System.out.println(repeatingEle(a));
        System.out.println(repeatingEle2(a1));
        int arr[] = { 0, 2, 1, 3, 2, 2 };
        Arrays.sort(arr);
        System.out.println(repeatingEle3(arr));
        int arr1[] = { 1, 2, 1, 3, 4, 3 };
        repeatingele4(arr1);
    }

    // super naive solution.
    static int repeatingEle(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return a[i];
                }
            }
        }
        return -1;
    }

    // naive solution 2
    static int repeatingEle2(int a[]) {
        for (int i = 0; i < a.length; i++) {

            if (a[i] == a[i + 1]) {
                return a[i];
            }
        }

        return -1;
    }

    static int repeatingEle3(int arr[]) {
        boolean visit[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visit[arr[i]])
                return arr[i];
            visit[arr[i]] = true;
        }

        return -1;
    }

    public static int[] repeatingele4(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> hmap : map.entrySet()) {
            Integer i = hmap.getKey();
            Integer i2 = hmap.getValue();
            if (i == 2) {
                return ans;
            }
        }
        return ans;
    }
}
