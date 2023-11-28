//4. Display Singly linear linked list in reverse order.

public class SLLL {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public SLLL() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List: ");
		while(trav!=null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) 
			head = newNode;
		
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			tail = head;
			while(tail.next!=null) {
				tail = tail.next;
			}
			tail.next = newNode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			return;
		}
		else {
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == null) {
			head = null;
		}
		else {
			tail = head;
			while(tail.next.next!=null) {
				tail = tail.next;
			}
			tail.next = null;
		}
	}
	
	public void insertAfterGivenNode(int value, int data) {
		Node newNode = new Node(value);
		if(isEmpty())
			head = newNode;
		else {
			Node trav = head;
			while(trav.data!=data) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	
	public void insertBeforeGivenNode(int value, int data) {
		Node newNode = new Node(value);
		if(isEmpty())
			head = newNode;
		else {
			Node trav = head;
			while(trav.next.data!=data) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	
	public void reverse() {
		Node curr = head;
		Node next = curr.next;
		Node prev = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
}
