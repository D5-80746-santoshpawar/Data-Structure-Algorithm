//3. Implement Deque using doubly linear linked list with head & tail.


public class Deque {
	DLLL list;
	public Deque() {
		list = new DLLL();
	}
	
	public void push(int value) {
		list.addFirst(value);
	}
	
	public void popFront() {
		list.deleteFirst();
	}
	
	public void popRear() {
		list.deleteLast();
	}
	
	public int peek() {
		return list.getData();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		Deque q = new Deque();
		System.out.println(q.isEmpty());
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		System.out.println(q.isEmpty());
		q.popFront();
		q.popRear();
		q.popRear();
		System.out.println(q.peek());
	}
}
