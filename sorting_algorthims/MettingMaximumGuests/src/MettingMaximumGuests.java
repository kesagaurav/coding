import java.util.Arrays;

public class MettingMaximumGuests {
    public static void main(String[] args) throws Exception {
        int arr[] = { 900, 600, 700 };
        int dep[] = { 1000, 800, 730 };
        int n = arr.length;

        System.out.print(maxGuest(arr, dep));
    }

    static int maxGuest(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0, cur = 1, res = 1;
        while (i < arr.length && j < arr.length) {
            if (arr[i] < dep[j]) {
                cur++;
                i++;
            } else {
                cur--;
                j++;
            }
            res = Math.max(cur, res);
        }
        return res;

    }
    // minimum platfrom same logic for the meeting maximum guests.
    // Arrays.sort(arr);
    // Arrays.sort(dep);
    // int i = 1, j = 0, platform = 1, res = 1;
    // while (i < arr.length && j < arr.length) {
    // if (arr[i] <= dep[j]) {
    // platform++;
    // i++;
    // } else if(arr[i]>dep[j]) {
    // platform--;
    // j++;
    // }
    // res=Math.max(platform,res);

    // }
    // return res;
}
