import java.util.*;

class Linkedlistqueue {
    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head;
        static Node tail;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int n) {
            Node newNode = new Node(n);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                return head.data;
            }
        }

        public static void remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            int result = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return;
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Queue obj = new Queue();
        obj.add(1);
        obj.remove();
        obj.add(2);
        obj.add(3);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.remove();
        }
    }
}
