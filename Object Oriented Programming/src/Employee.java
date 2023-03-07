import java.io.*;

public class Employee {
  private String name;
  private int age;
  String designation;
	double salary;
	
	public  Employee(String name){
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setDesignation(String empDesignation) {
		this.designation=empDesignation;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void printEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+salary +"/per month");
	}

}
