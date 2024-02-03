public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 319, 212, 6, 8, 100, 50 };
        int n = arr.length;
        radixSort(arr);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    public static void radixSort(int arr[]) {
        int mx = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (mx > arr[i]) {
                mx = arr[i];
            }
        }
        for (int exp = 1; mx / exp > 0; exp++) {
            countingSort1(arr, exp);
        }
    }

    static void countingSort1(int arr[], int exp) {
        int count[] = new int[10];
        for (int i = 0; i < 10; i++)
            count[i] = 0;
        for (int i = 0; i < arr.length; i++)
            count[(arr[i] / exp) % 10]++;
        for (int i = 1; i < 10; i++) {
            count[i] = count[i - 1] + count[i];

        }
        int output[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }
}
