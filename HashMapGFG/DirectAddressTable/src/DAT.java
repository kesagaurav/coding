public class DAT {
    static int table[] = new int[1000];

    public static void main(String[] args) throws Exception {
        DAT dat = new DAT();
        dat.insert(10);
        dat.insert(20);
        dat.insert(119);
        System.out.println(dat.search(10));
        System.out.println(dat.search(20));
        dat.del(119);
        System.out.println(dat.search(119));
    }

    static void insert(int i) {
        table[i] = 1;
    }

    static void del(int i) {
        table[i] = 0;
    }

    static int search(int i) {
        return table[i];
    }

}
