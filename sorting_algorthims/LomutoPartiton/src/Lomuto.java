import java.util.HashMap;
import java.util.HashSet;

public class Lomuto {
    public static void main(String[] args) throws Exception {
        int a[] = { 10, 80, 30, 90, 40, 50, 70 };
        int n = a.length;
        // lomutoPartition(a, 0, n - 1);
        quickSort(a, 0, n - 1);
        for (int x : a) {
            System.out.println(x + " ");
        }
        HashMap<Integer, Integer> hmap = new HashMap();
        hmap.put(1, 1);
        HashSet<Integer> set = new HashSet<>();
        set.add(1);

    }

    public static int lomutoPartition(int ar[], int l, int h) {
        int pivot = ar[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (ar[j] < pivot) {
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        int temp = ar[i + 1];
        ar[i + 1] = ar[h];
        ar[h] = temp;
        return i + 1;

    }

    public static void quickSort(int a[], int l, int h) {
        if (l < h) {
            int p = lomutoPartition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }
}
