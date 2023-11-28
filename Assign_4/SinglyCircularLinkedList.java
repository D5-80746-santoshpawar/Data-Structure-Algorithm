public class SinglyCircularLinkedList {
    private static class Node{
        private int data;
        private Node next;

        public Node(int value){
            this.data = value;
            this.next = null;
        }
    }
    private Node tail;
    private int count;
    public SinglyCircularLinkedList() {
        this.tail = null;
        this.count = 0;
    }

    public  boolean isEmpty(){
        return tail == null;
    }
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            tail = newNode;
            tail.next = newNode;
        }
        else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        count++;
    }

    public void addLast(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            tail = newNode;
            newNode.next = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public void addPosition(int value, int position){
        if(position < 1 || position > count + 1) return;
        //1.Create the node.
        Node newNode = new Node(value);
        if(isEmpty()){
            tail = newNode;
            newNode.next = newNode;
        }
        else if(position == 1){
            addFirst(value);
        } else if (position == count) {
            addLast(value);
        } else {
            Node trav = tail.next;
            for (int i = 1; i < position - 1; i++, trav = trav.next) ;
            newNode.next = trav.next;
            trav.next = newNode;
        }
        count++;
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List is empty.");
            return;
        }
        else if(count == 1) tail = null;
        else{
            tail.next = tail.next.next;
        }
    }

    public void deleteLast(){
        if(isEmpty()){
            System.out.println("List is empty.");
            return;
        }
        else if(count == 1) tail = null;
        else{
            Node temp = tail.next;
            while(temp.next.next!= tail.next)
                temp = temp.next;
            temp.next = tail.next;
            tail = temp;
        }
    }
    public void display() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node curr = tail.next;
        do{
            System.out.print(curr.data + "->");
            curr = curr.next;
        }while(curr != tail.next);
        System.out.println();
    }
}



