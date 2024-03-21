import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int b[] = { 1, 2, 3 };
        // // System.out.println(max(b));
        // for (int i = b.length - 1; i >= 0; i--) {
        // System.out.println(b[i]);
        // }

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek() + " the element ");
        System.out.println("delete the element of stack " + st.pop());
        System.out.println("after deleting the elements the stack are");
        st.stream().forEach(e -> System.out.println(e));
        System.out.println("search element is" + st.search(st.get(2)));
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        System.out.println("pq is " + pq.peek());
        System.out.println("pq is " + pq.poll());

        // class Node {
        // int d;
        // App next;
        // App random;

        // public Node(int d, App next, App random) {
        // this.d = d;
        // this.next = null;
        // this.random = null;
        // }

        // }
        String s = "gaurav";
        Map<Character, Integer> hmap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> hmap1 : hmap.entrySet()) {
            System.out.println(hmap1.getKey() + "  " + " " + hmap1.getValue());

        }

    }

}
