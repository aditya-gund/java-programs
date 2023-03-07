
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Pranav Hindole");
		Employee emp2 = new Employee("Aditya Gund");
		emp1.setAge(22);
		emp1.setDesignation("Software Development Engineer");
		emp1.setSalary(250000);
		emp1.printEmployee();
		System.out.println("--------------------------------------------------");
		emp2.setAge(22);
		emp2.setDesignation("Manual Tester");
		emp2.setSalary(12000);
		emp2.printEmployee();
	}

}
