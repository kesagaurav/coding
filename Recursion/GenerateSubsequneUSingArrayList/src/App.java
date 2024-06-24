public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str = "abc";
        String end = "";
        isSubSeq(str, end);
    }

    // static ArrayList<String> subSeq(String s) {
    // if (s.length() == 0) {
    // ArrayList<String> bres = new ArrayList<>();
    // bres.add("");
    // return bres;
    // }
    // char ch = s.charAt(0);
    // String ros = s.substring(1);
    // ArrayList<String> rres = subSeq(ros);
    // ArrayList<String> mmre = new ArrayList<>();
    // for (String rrst : rres) {
    // rres.add(" " + rrst);

    // }
    // for (String rrst : rres) {
    // rres.add(ch + rrst);

    // }

    // return mmre;

    // }

    static void isSubSeq(String str, String end) {
        if (str.length() == 0) {
            System.out.println(end);
            return
        }
        char ch = str.charAt(0);
        String rreq = str.substring(1);
        isSubSeq(str, end + "");
        isSubSeq(str, ch + end);
    }
}
