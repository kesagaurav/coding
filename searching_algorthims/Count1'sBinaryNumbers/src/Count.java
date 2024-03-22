public class Count {
    public static void main(String[] args) throws Exception {
        int a[] = { 0, 0, 0, 1, 1, 1, 1, 1 };
        System.out.println("count is " + conunt(a));
        System.out.println(countOnes(a, 8));
    }

    // naive soln
    public static int conunt(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                c++;
            }
        }
        return c;
    }

    // efficient soln
    static int countOnes(int arr[], int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 0)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid - 1] == 0)
                    return (n - mid);
                else
                    high = mid - 1;
            }
        }

        return 0;
    }
}
