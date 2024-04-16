import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Set {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<String>();
        set.add("gaurav");
        set.add("gfg");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.remove("gfg"));
        System.out.println(set.size());
        for (String string : set) {
            System.out.println(string);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(2, 2);
        hmap.put(3, 3);

        for (Map.Entry<Integer, Integer> map : hmap.entrySet()) {
            if (set2.contains(map.getKey())) {
                System.out.println(map.getKey());
            }
        }

        HashSet<String> set3 = new HashSet<String>();
        set3.add(null);
        HashSet<List> set4 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        set4.add(list);
        System.out.println(list);

    }
}
