import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int a[] = { 9, 8, 1, 5, 3, 2, 7, 6, 4 };
        // Arrays.sort(a);
        Arrays.sort(a, 1, 4);
        System.out.println(Arrays.toString(a));
        Point p[] = { new Point(10, 20), new Point(20, 30), new Point(1, 2) };
        Arrays.sort(p, new MyComp());
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].x + " " + p[i].y);
        }

        // Arrays.sort(p, Collections.reverseOrder());

        Integer arr[] = { 3, 5, 7, 2, 4, 6 };
        Arrays.sort(arr, new EvenOdd());
        System.out.println(Arrays.toString(arr));

    }
}
