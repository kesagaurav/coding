public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Gaurav");
        String str = "abc";
        int index = 0;
        String curr = "";
        printSubSet(str, index, curr);
    }

    static void printSubSet(String str, int index, String curr) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }
        printSubSet(str, index + 1, curr + str.charAt(index));
        printSubSet(str, index + 1, curr);
    }
}
