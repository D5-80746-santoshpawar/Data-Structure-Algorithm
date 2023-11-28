//1. Implement add and delete at position in doubly circular linked list.

public class DCLL {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	
	public DCLL() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		}
		else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
			head = nn;
		}
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		if(isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		}
		else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	
	public void fDisplay() {
		if(isEmpty())
			return;
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != head);	
		System.out.println("");
	}
	
	public void rDisplay() {
		if(isEmpty())
			return;
		Node trav = head.prev;
		System.out.print("Reverse List : ");
		do {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}while(trav != head.prev);	
		System.out.println("");
	}
	
	public void addPosition(int value, int pos) {
		Node nn = new Node(value);
		if(isEmpty()) {
			head = nn;
		}
		else if(pos<=1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i=1;i<pos-1;i++) {
				trav = trav.next;
			}
			nn.prev = trav;
			nn.next = trav.next;
			trav.next.prev = nn;
			trav.next = nn;
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(pos<=1)
			deleteFirst();
		else {
			Node trav = head;
			for(int i=1;i<pos;i++) {
				trav = trav.next;
			}
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
	}
}
