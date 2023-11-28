
public class LL {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public LL() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = nn;
		else {
			nn.next = head;
			head = nn;
		}
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = nn;
		else {
			Node trav = head;
			while(trav.next!=null) {
				trav = trav.next;
			}
			trav.next = nn;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else {
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else {
			Node trav = head;
			while(trav.next.next!=null) {
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	public int getData() {
		return head.data;
	}
}
