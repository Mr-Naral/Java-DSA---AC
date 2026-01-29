
import java.util.LinkedList;

class LL {

    private Node head;
    private int size = 0;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node lastSecNode = head;
        Node lastNode = head.next;
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            lastSecNode = lastSecNode.next;
        }
        lastSecNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public void showList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + " ==> ");
            currNode = currNode.next;
        }
        System.out.println(currNode.data + " ==> NULL");
        System.out.println("size: " + size + "\n");
    }

}

class LinkedListExample {

    public static void main(String[] args) {
        // LL list = new LL();
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        //list.showList();
        System.out.println(list);
        list.addLast(2);
        //list.showList();
        System.out.println(list);
        list.addFirst(0);
        //list.showList();
        System.out.println(list);
        list.removeFirst();
        //list.showList();
        System.out.println(list);
        list.removeLast();
        //list.showList();
        System.out.println(list);
        list.removeLast();
        //list.showList();
        System.out.println(list);
    }
}
