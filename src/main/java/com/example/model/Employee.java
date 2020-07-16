package com.example.model;

public class Employee {
	
	private int id;
	private String lastName;
	private String firstName;
	private int monthlySalary;

	public Employee(int id, String lastName, String firstName, int monthlySalary) {
			
		super();
		this.id=id;
		this.lastName=lastName;
		this.firstName=firstName;
		this.monthlySalary=monthlySalary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getLastName()=" + getLastName() + ", getFirstName()="
				+ getFirstName() + ", getMonthlySalary()=" + getMonthlySalary() + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}



}
