import java.util.Comparator;

public class EvenOdd implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return a.compare(a % 2, b % 2);
    }

}
