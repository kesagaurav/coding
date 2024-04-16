import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) throws Exception {
        int a[] = { 10, 20, 30 };
        int b[] = { 30, 10, };
        intersction(a, b);
        System.out.println("usgin hashset");
        intersction1(a, b);

    }

    // naive solution
    static void intersction(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    System.out.println(a[i]);

            }
        }
    }

    static void intersction1(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);

        }
        for (int j = 0; j < a.length; j++) {
            if (set.contains(a[j]))
                System.out.println(a[j] + " ");

        }

    }

}
