public class Search {
    public static void main(String[] args) throws Exception {
        int arr[] = { 100, 200, 400, 1000, 10, 20 }, n = 6;

        int x = 10;

        System.out.println(search(arr, n, x));
    }

    // naive sol^n
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++)
            if (arr[i] == x)
                return i;

        return -1;
    }

}
