import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[] { 10, 10, 5, 3, 20, 5 };

        int n = arr.length;
        int k = 4;
        countDistinct(arr, k);
        printDistinct(arr, n, k);
    }

    // naive sol
    static void printDistinct(int arr[], int n, int k) {
        for (int i = 0; i <= n - k; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                boolean flag = false;
                for (int p = 0; p < j; p++) {
                    if (arr[i + j] == arr[i + p]) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false)
                    count++;

            }
            System.out.print(count + " ");
        }
    }

    // efficient solution
    static void countDistinct(int a[], int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            hmap.put(a[i], hmap.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(hmap.size());
        for (int i = k; i < a.length; i++) {
            hmap.put(a[i - k], a[i - k] - 1);
            if (hmap.get(a[i - k]) == 0) {
                hmap.remove(a[i - k]);
            }
            hmap.put(a[i], hmap.getOrDefault(a[i], 0) + 1);
            System.out.println(hmap.size());

        }
    }
}
