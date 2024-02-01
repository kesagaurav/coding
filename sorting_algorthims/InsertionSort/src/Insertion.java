public class Insertion {
    public static void main(String[] args) throws Exception {
        int a[] = { 20, 5, 40, 60, 10, 30 };
        insertionSort(a);
        for (int x : a) {
            System.out.println(x + " ");
        }
    }

    static void insertionSort(int a[]) {
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}
