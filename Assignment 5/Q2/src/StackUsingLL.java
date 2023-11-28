//2. Implement stack and queue using linked list.

public class StackUsingLL {
	LL list;
	public StackUsingLL() {
		list = new LL();
	}
	
	public void push(int value) {
		list.addFirst(value);
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
		StackUsingLL st = new StackUsingLL();
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.isEmpty());
		st.pop();
		st.pop();
		System.out.println(st.peek());
	}
}
