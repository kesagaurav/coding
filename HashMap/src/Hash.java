import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hash {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        for (Map.Entry<Integer, Integer> hmap : map.entrySet()) {
            System.out.println("key is " + hmap.getKey() + " value is " + hmap.getValue());

        }
        int ar[] = { 10, 10, 20, 20, 30 };
        HashSet<Integer> set = new HashSet<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {

            set.add(ar[i]);
            map1.put(ar[i], map1.getOrDefault(ar[i], 0) + 1);

        }
        System.out.println(set.size());
        for (Map.Entry<Integer, Integer> hmap : map1.entrySet()) {
            System.out.println("key is " + hmap.getKey() + " value is " + hmap.getValue());

        }

    }
}
