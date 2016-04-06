package com.farhad.composite;

/*Acts as a simple composite*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Executive extends Employee {

	private int employeeId;
	private String employeeName;
	private String title;
	private double employeeSalary;

	public Executive(int employeeId, String employeeName, String title, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.title = title;
		this.employeeSalary = employeeSalary;
	}

	List<Employee> emp = new ArrayList<Employee>();

	public void add(Employee employee) {
		emp.add(employee);
	}

	public Employee getChild(int i) {
		return emp.get(i);
	}

	public void remove(Employee employee) {
		emp.remove(employee);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getTitle() {
		return title;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void display() {

		System.out.println("**************************");
		System.out.println("Employee ID =" + getEmployeeId());
		System.out.println("Employee Name =" + getEmployeeName());
		System.out.println("Employee Title =" + getTitle());
		System.out.println("Employee Salary =" + getEmployeeSalary());
		System.out.println("***************************");
		Iterator<Employee> it = emp.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			emp.display();
		}
	}
}
