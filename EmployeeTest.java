public class EmployeeTest{
	public static void main(String args[]){
		//creating an employee
		Employee employee1 = new Employee(89);
		employee1.setFName("John");
		employee1.setLName("Doe");
		employee1.setGender("Male");
		employee1.display();

		//creating a casual employee
		CasualEmployee casual1 = new CasualEmployee(78);
		casual1.setFName("Jane");
		casual1.setLName("Doe");
		casual1.setGender("Female");
		casual1.setHourlyRate(54.3);
		casual1.setHoursWorked(11);
		casual1.display();
	}
}
