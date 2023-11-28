public class Main {
    public static void main(String[] args) {
    /*SinglyLinkedListLin list = new SinglyLinkedListLin();
    list.addFirst(10);
    list.addFirst(20);
    list.addFirst(30);
    list.addFirst(40);
    list.addFirst(50);
   // list.display();
        System.out.println(list.isEmpty());
    list.delLast();
    //list.display();
        list.delFirst();
        //list.display();
        list.addLast(10);
       // list.display();
        list.addLast(50);
        list.display();*/
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
       list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addLast(60);
        list.addLast(70);
        list.addPosition(90, 5);
        //list.deleteFirst();
        list.deleteLast();
        list.display();

    }
}