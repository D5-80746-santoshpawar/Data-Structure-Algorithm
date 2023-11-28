import java.util.List;

public class Tester {

	public static void main(String[] args) {
		DCLL l1 = new DCLL();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		
		l1.addPosition(100, 2);
		l1.addPosition(200, 6);
		l1.fDisplay();
//		l1.deleteFirst();
//		l1.deleteLast();
		l1.deletePosition(2);
		l1.deletePosition(5);

		l1.fDisplay();
		l1.deleteFirst();
		l1.fDisplay();
		//l1.rDisplay();

	}

}
