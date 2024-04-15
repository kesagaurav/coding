import java.util.ArrayList;

public class MyHash {
    int capacity, size;
    ArrayList<Integer> list = new ArrayList<>();
    int[] arr;

    public MyHash(int capacity) {
        this.capacity = capacity;
        size = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
            list.add(arr[i]);
        }
    }

    public int hashKey(int key) {
        return key % capacity;
    }

    public boolean insert(int key) {
        if (size == capacity)
            return false;
        int i = hashKey(key);
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key)
            i = (i + 1) % capacity;
        if (arr[i] == key)
            return false;
        else {
            arr[i] = key;
            size++;
            return true;
        }
    }

    public boolean delete(int b) {
        int c = hashKey(b);
        int i = c;
        while (arr[i] != -1) {
            if (arr[i] == b) {
                arr[i] = -2;
                return true;
            }
            i = (i + 1) % capacity;
            if (i == c)
                return false;

        }
        return false;

    }

    public boolean search(int a) {
        int b = hashKey(a);
        int i = b;
        while (arr[i] != -1) {
            if (arr[i] == a)
                return true;
            i = (i + 1) % capacity;
            if (i == b)
                return false;

        }
        return false;

    }
}

class Main {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(49);
        mh.insert(56);
        mh.insert(72);
        if (mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
        mh.delete(56);
        if (mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}