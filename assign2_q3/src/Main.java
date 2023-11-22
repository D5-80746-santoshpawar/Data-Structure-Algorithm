

import java.util.Scanner;

public class Main {
	
	public static void sortBySalary(Employee[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j].getSalary()>arr[j+1].getSalary()) {
					Employee e = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = e;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[3];
		arr[0] = new Employee(1,"Bhanu",50000);
		arr[1] = new Employee(2,"Devika",25000);
		arr[2] = new Employee(3,"Bhanu1",20000);

//		System.out.println("Enter Emp id : ");
//		int id = sc.nextInt();
//		Employee e1 = searchById(arr, id);
//		if (e1==null) {
//			System.out.println("Employee not found");
//		} else {
//			System.out.println(e1);
//		}
		
//		System.out.println("Enter Emp name : ");
//		String name = sc.next();
//		Employee e2 = searchByName(arr, name);
//		if (e2==null) {
//			System.out.println("Employee not found");
//		} else {
//			System.out.println(e2);
//		}
		System.out.println("Employee array before sort : ");
		for(Employee e:arr) {
			System.out.println(e);
		}
		sortBySalary(arr);
		System.out.println("Employee array after sort : ");
		for(Employee e:arr) {
			System.out.println(e);
		}
	}

}
