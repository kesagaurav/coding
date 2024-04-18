import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 10, 10, 20, 30, 20, 10, 10 };
        int k = 2;
        countNBykOccurences(a, k);
        int n = a.length;
        System.out.println("using hashmap");
        countNByK1(a, k);
        printNByK(a, n, k);
    }

    // naive soln
    static void countNBykOccurences(int a[], int k) {
        int i = 1, count = 1;
        Arrays.sort(a);
        while (i < a.length) {
            while (i < a.length && a[i] == a[i - 1]) {
                count++;
                i++;
            }
            if (count > a.length / k) {
                System.out.println(a[i - 1]);
                count = 1;
                i++;
            }
        }

    }

    // efficinet soln 1
    static void countNByK1(int a[], int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hmap.put(a[i], hmap.getOrDefault(a[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> map : hmap.entrySet()) {
            if (map.getValue() > a.length / k) {
                System.out.println(map.getKey());
            }
        }
    }

    // moore voting algorthim //efficinet soln 2
    static void printNByK(int arr[], int n, int k) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                int count = m.get(arr[i]);
                m.put(arr[i], count + 1);
            } else if (m.size() < k - 1)
                m.put(arr[i], 1);
            else
                for (Map.Entry x : m.entrySet()) {
                    Integer c = (Integer) x.getValue();
                    m.put((Integer) x.getKey(), c - 1);
                    if ((Integer) x.getKey() == 0)
                        m.remove(x.getKey());
                }
        }
        for (Map.Entry x : m.entrySet()) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((Integer) x.getKey() == arr[i])
                    count++;

            }
            if (count > n / k)
                System.out.print(x.getKey() + " ");
        }
    }
}
