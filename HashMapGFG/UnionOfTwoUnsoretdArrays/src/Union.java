public class Union {
    public static void main(String[] args) throws Exception {
        int a[] = { 10, 20, 30 };
        int b[] = { 20, 30 };
        System.out.println(union(a, b));
    }

    public static int union(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();

        for (int x : a) {
            set.add(x);
        }
        for (int y : b) {
            set.add(y);
        }
        return set.size();
    }
}
