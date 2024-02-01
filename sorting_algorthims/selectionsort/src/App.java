public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 2, 1, 4, 3 };
        selectionsort(a);
        System.out.println(" slection sort values are ");
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void selectionsort(int a[]) {
        int min_ind = 0;
        for (int i = 0; i < a.length; i++) {
            min_ind = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_ind]) {
                    min_ind = j;
                }
            }

            int temp = a[i];
            a[i] = a[min_ind];
            a[min_ind] = temp;
        }

    }
}
