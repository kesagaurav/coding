import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    int capacity = 0;
    ArrayList<LinkedList<Integer>> list;

    public Chaining(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < capacity; i++) {
            list.add(new LinkedList<Integer>());
        }
    }

    public void insert(int a) {
        int bucket = a % capacity;
        list.get(bucket).add(a);

    }

    public void delete(int a) {
        int bucket = a % capacity;
        list.get(bucket).remove((Integer) a);
    }

    public boolean search(int a) {
        int bucket = a % capacity;

        return list.get(bucket).contains(a);
    }
}
