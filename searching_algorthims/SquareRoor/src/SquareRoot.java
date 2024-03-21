public class SquareRoot {
    public static void main(String[] args) throws Exception {
        int x = 15;
        // System.out.println(sqroot(x));
        System.out.println(naiveSqRoot(x));
    }

    // naive sq root
    static int sqroot(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return (i - 1);
    }

    // efficent soln
    static int naiveSqRoot(int x) {
        int low = 0, high = x, ans = -1;
        while (low <= high) {
            int mid = low + high / 2;
            int msq = mid * mid;
            if (msq == x) {
                return mid;
            } else if (msq > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }

        }
        return ans;

    }
}
