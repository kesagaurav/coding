public class TwoPointers {
    public static void main(String[] args) throws Exception {
        int a[] = { 2, 5, 8, 12, 30 };
        System.out.println(twoPointers1(a, 17));
    }

    // naive approach
    public static boolean twoPointers(int a[], int x) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    // efficent apprach using 2 pointer
    public static boolean twoPointers1(int a[], int x) {
        int i = 0, high = a.length - 1;
        while (i < high) {
            if (a[i] + a[high] == x) {
                return true;
            } else if (a[i] + a[high] < x) {
                i = i + 1;
            } else {
                high -= 1;
            }
        }
        return false;
    }
}
