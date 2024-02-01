public class DutchNationalFlag {
    public static void main(String[] args) throws Exception {
    }

    static void sort(int arr[], int l, int h) {
        int mid = 0;
        l = 0;
        h = arr.length - 1;
        while (mid <= h) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[l];
                arr[l] = temp;
                l++;
                mid++;
            } else if (mid == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[h];
                arr[h] = temp;
            }

        }
    }
}
