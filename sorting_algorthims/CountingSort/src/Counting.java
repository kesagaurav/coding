public class Counting {
    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 4, 4, 4, 1, 0 };
        countingSort(arr, 5);
        countingSort1(arr, 5);

        for (int x : arr) {
            System.out.println(x + " ");
        }
    }

    // naive
    static void countingSort(int arr[], int k) {
        int count[] = new int[k];
        for (int i = 0; i < k; i++)
            count[i] = 0;
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;
        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    // efficeint solution
    static void countingSort1(int arr[], int k) {
        int count[] = new int[k];
        for (int i = 0; i < k; i++)
            count[i] = 0;
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;
        for (int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i];

        }
        int output[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }
}
