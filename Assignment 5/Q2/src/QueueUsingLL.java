
public class QueueUsingLL {
	LL list;
	public QueueUsingLL() {
		list = new LL();
	}
	
	public void push(int value) {
		list.addLast(value);
	}
	
	public void pop() {
		list.deleteFirst();
	}
	
	public int peek() {
		return list.getData();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		QueueUsingLL q = new QueueUsingLL();
		System.out.println(q.isEmpty());
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		System.out.println(q.isEmpty());
		q.pop();
		q.pop();
		System.out.println(q.peek());
	}
}
