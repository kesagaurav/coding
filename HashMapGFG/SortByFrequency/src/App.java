import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        int a[] = { 5, 5, 4, 6, 4 };
        System.out.println(count(a));

    }

    static ArrayList<Integer> count(int arr[]) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            tmap.put(arr[i], tmap.getOrDefault(arr[i], 0) + 1);
            list.add(arr[i]);
        }

        Collections.sort(list, (a, b) -> {

            int freq1 = hmap.get(a);
            int freq2 = hmap.get(b);
            if (freq2 != freq1) {
                return freq2 - freq1;
            } else {
                return a - b;
            }

        });
        return list;

    }

}

// sort by frequency.
// static ArrayList<Integer> sortByFreq(int arr[], int n) {
// // add your code here
// HashMap<Integer, Integer> hmap = new HashMap<>();
// ArrayList<Integer> list = new ArrayList<>();
// for (int i = 0; i < arr.length; i++) {
// hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
// list.add(arr[i]);
// }

// Collections.sort(list, (a, b) -> {

// int freq1 = hmap.get(a);
// int freq2 = hmap.get(b);
// if (freq1 != freq2) {
// return freq2 - freq1;
// } else {
// return a - b;
// }

// });
// return list;
// }