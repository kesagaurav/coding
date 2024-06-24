public class StairPath {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static ArrayList<String> getStairs(int s) {
        if (s == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (s < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> path1 = getStairs(s - 1);
        ArrayList<String> path2 = getStairs(s - 2);
        ArrayList<String> path3 = getStairs(s - 3);
        ArrayList<String> paths = new ArrayList<String>();
        for (String path : path1) {
            paths.add(1 + path);
        }
        for (String path : path2) {
            paths.add(2 + path);
        }
        for (String path : path3) {
            paths.add(3 + path);
        }
        return paths;

    }
}
