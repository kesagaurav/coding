
public class Practice {
    public static void main(String[] args) {
        String a = "gaurav";
        System.out.println(delAlternate(a));
    }

    static String delAlternate(String s) {
        StringBuilder sb = new StringBuilder(s);
        String result = "";
        for (int i = 0; i < sb.length(); i += 2) {
            result += sb.charAt(i);
            System.out.println(result);
        }
    }
}