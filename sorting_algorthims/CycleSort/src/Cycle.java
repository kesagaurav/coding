public class Cycle {
    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 20, 50, 30, 40 };
        cycleSort(arr);
        for (int x : arr) {
            System.out.println(x + " ");
        }
    }

    static void cycleSort(int arr[]) {
        for (int cs = 0; cs < arr.length - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < arr.length; i++)
                if (arr[i] < item)
                    pos++;
            // swap(item,arr[pos])

            int temp = item;
            item = arr[pos];
            arr[pos] = temp;
            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < arr.length; i++)
                    if (arr[i] < item)
                        pos++;

                // swap(item,arr[pos])
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }
}
