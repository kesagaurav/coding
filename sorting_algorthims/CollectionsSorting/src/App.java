import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);
        List<Point> plist = new ArrayList<>();
        plist.add(new Point(20, 30));
        plist.add(new Point(30, 40));
        plist.add(new Point(5, 10));
        Collections.sort(plist, new MyComp());
        for (Point p : plist) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
