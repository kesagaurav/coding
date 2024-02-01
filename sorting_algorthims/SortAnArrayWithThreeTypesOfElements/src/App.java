public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 1, 0, 1, 2, 0, 2 };
        sort(a);
        for (int x : a) {
            System.out.println(x + " ");
        }
    }

    static void sort(int a[]) {
        int temp[] = new int[a.length];
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == 0) {
                temp[i] = a[j];
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] == 1) {
                temp[j] = a[j];
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] == 2) {
                temp[j] = a[j];
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            a[j] = temp[j];
        }
    }
}
