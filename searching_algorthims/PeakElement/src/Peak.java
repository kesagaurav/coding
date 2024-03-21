public class Peak {
    public static void main(String[] args) throws Exception {
        int a[] = { 6, 7, 8, 20, 12 };
        System.out.println(peakElement(a));
    }

    static int peakElement(int a[]) {
        if (a.length == 0) {
            return a[0];
        }
        if (a[0] >= a[1]) {
            return a[1];
        }
        if (a.length - 1 >= a.length - 2) {
            return a.length - 2;
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
                return a[i];
            }
        }
        return -1;
    }

    static int getPeak(int a[]) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + high / 2;
            if ((mid == 0 || a[mid] <= a[mid - 1]) && (mid == a.length - 1 || a[mid + 1] <= a[mid])) {
                return mid;
            } else if (mid > 0 && a[mid - 1] >= a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

}

// int low = 0, high = arr.length - 1,mid=0;
// while (low <= high) {
// mid = low + high / 2;
// if (mid == 0 || arr[mid] <= arr[mid - 1] && mid == arr.length - 1 || arr[mid
// + 1] <= arr[mid]) {
// return mid;// return mid; //instearrd of > we shuould keep <=
// } else if (mid > 0 && arr[mid - 1] >= arr[mid]) {
// high = mid - 1;
// } else {
// low = mid + 1;
// }
// }