package com.sunbeam;

import java.util.Scanner;

public class Main {
	
	public static Employee searchById(Employee[] arr,int id) {
		for (Employee e:arr) {
			if (e.getEmpid()==id) {
				return e;
			}
		}
		return null;
	}
	
	public static Employee searchByName(Employee[] arr,String name) {
		for (Employee e:arr) {
			if (e.getName().equals(name)) {
				return e;
			}
		}
		return null;
	}
	
	public static Employee searchBySalary(Employee[] arr,double salary) {
		for (Employee e:arr) {
			if (e.getSalary()==salary) {
				return e;
			}
		}
		return null;
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
		
		System.out.println("Enter Emp salary : ");
		double salary = sc.nextDouble();
		Employee e2 = searchBySalary(arr, salary);
		if (e2==null) {
			System.out.println("Employee not found");
		} else {
			System.out.println(e2);
		}
	}

}
