public class Interval implements Comparable<Interval> {
    int i;
    int j;

    public Interval(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public int compareTo(Interval i) {
        return i.i - i.j;
    }

};
