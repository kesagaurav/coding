import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        // System.out.println("stack class");
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println("--------------------------------");
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.add(i));
        }
        Node d = new Node(20);
        d.left = new Node(30);
        d.right = new Node(50);

    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

        public Node root;

        public void inorder(Node data) {
            inorder(root.left);
            System.out.println(data);
            inorder(root.right);
        }

    }
}