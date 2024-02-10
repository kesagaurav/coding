public class CountOccurences {
    public static void main(String[] args) throws Exception {
        int a[] = { 10, 20, 20, 20, 30 };
        System.out.println(countOccurences(a, 20));
    }

    private static int countOccurences(int arr[], int x) {
        int a = arr[0], c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                c++;
            }
        }
        return c;
    }
}
