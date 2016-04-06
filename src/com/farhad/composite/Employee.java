package com.farhad.composite;

/*This abstract class acts as a component is the abstraction for all components, including composite ones*/

public abstract class Employee {

	public int getEmployeeId() {
		throw new UnsupportedOperationException();
	}

	public String getEmployeeName() {
		throw new UnsupportedOperationException();
	}

	public String getTitle() {
		throw new UnsupportedOperationException();
	}

	public double getEmployeeSalary() {
		throw new UnsupportedOperationException();
	}

	public void display() {
		throw new UnsupportedOperationException();
	}

	public void add(Employee employee) {
		throw new UnsupportedOperationException();
	}

	public void remove(Employee employee) {
		throw new UnsupportedOperationException();
	}

	public Employee getChild(int i) {
		throw new UnsupportedOperationException();
	}
}