package com.farhad.composite;

/*Represents leaf*/

public class Clerk extends Employee {

	private int employeeId;
	private String employeeName;
	private String title;
	private double employeeSalary;

	public Clerk(int employeeId, String employeeName, String title, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.title = title;
		this.employeeSalary = employeeSalary;
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
	}
}
