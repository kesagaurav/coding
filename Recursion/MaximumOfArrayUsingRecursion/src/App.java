public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a[] = { 1, 2, 3, 5 };
        System.out.println(maxNumber(a, 0));
    }

    static int maxNumber(int a[], int i) {
        if (i == a.length - 1) {
            return a[i];
        }
        int largest = maxNumber(a, i + 1);
        if (largest > a[i]) {
            return largest;
        } else {
            return a[i];
        }
    }
}
