import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map2 {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(1, 1);
        hmap.put(2, 2);
        hmap.put(3, 3);
        hmap.put(4, 4);
        hmap.put(5, 5);
        System.out.println(hmap);
        if (hmap.containsValue(13)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(hmap.get(3));
        System.out.println(hmap.get(4));
        for (Map.Entry<Integer, Integer> map2 : hmap.entrySet()) {
            System.out.println(map2.getKey() + " " + map2.getValue());
        }

        HashMap<String, Integer> hmap2 = new HashMap<>();
        hmap2.put("gaurav", 1);
        hmap2.put("gfg", 2);
        hmap2.put("abc", 3);
        if (hmap.containsValue(3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(hmap2.get("gfg"));

        HashMap<String, Integer> hmap3 = new HashMap<>();
        hmap3.put("abc", null);
        System.out.println(hmap3);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, null);// key cannot be null,value can be null
        System.out.println(treeMap);

        // duplicate using hashmaps
        HashMap<String, Integer> hmap4 = new HashMap<>();
        hmap4.put("a", 1);
        hmap4.put("a", 1);
        hmap4.put("b", 3);
        System.out.println(hmap4);

    }
}
