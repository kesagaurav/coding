import java.util.HashMap;
import java.util.Map;

public class Frequencies {
    public static void main(String[] args) throws Exception {
        int a[] = { 10, 20 };
        // int c = 1;

        // for (int i = 0; i < a.length; i++) {
        // boolean flag = false;
        // for (int j = 0; j < i; j++) {
        // if (a[i] == a[j]) {
        // flag = true;
        // break;
        // }
        // }
        // if (flag == true) {
        // continue;
        // }
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[i] == a[j])
        // c++;
        // System.out.println(c + " " + a[i]);

        // }

        // }
        frequency(a);

    }

    // efficent solution
    static void frequency(int a[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            System.out.println(map1.getKey() + " " + map1.getValue());
        }
    }
}
