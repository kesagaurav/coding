package searching_algorthims.TripletInSortedArray1;

public class Triplet {
    public static void main(String[] args) throws Exception {
        int a[] = { 2, 3, 5, 6, 15 };
        System.out.println(isTriplet(a, 20));
    }

    static boolean isTriplet(int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // efficient approach
    static boolean isPair(int a[], int x, int si) {
        int i = si, j = a.length - 1;
        while (i < j) {
            if (a[i] + a[j] == x) {
                return true;
            } else if (a[i] + a[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    static boolean isTriplet1(int a[], int x) {
        for (int i = 0; i < a.length - 2; i++)
            if (isPair(a, x - a[i], i++))
                return true;

        return false;

    }
}
