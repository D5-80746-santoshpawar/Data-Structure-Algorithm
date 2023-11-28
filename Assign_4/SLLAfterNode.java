public class SLLAfterNode {
    private static class Node {
        private int data;
        private Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;
    //private SinglyLinkedListLin.Node tail;

    public SLLAfterNode() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null; /*&& tail == null;*/
    }

    public void addFirst(int value) {
        SinglyLinkedListLin.Node newNode = new SinglyLinkedListLin.Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void addLast(int value) {
        SinglyLinkedListLin.Node newNode = new SinglyLinkedListLin.Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delFirst() {
        //1.If list is empty
        if (isEmpty())
            return;
        //2.If list is not empty.
        //a.move head on second node.
        head = head.next;
    }

    public void delLast() {
        if (isEmpty()) return;
        else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            SinglyLinkedListLin.Node trav = head;
            while (trav.next.next != null)
                trav = trav.next;
            trav.next = null;
            tail = trav;


        }
    }

    public void display() {
        SinglyLinkedListLin.Node trav = head;
        System.out.print("List :");
        while (trav != null) {
            System.out.print("->" + trav.data);
            trav = trav.next;
        }
    }
}
