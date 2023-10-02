/**
 * This a class representating an Employee
 * It includes the pfNumber, Name and gender of the Employee
 *
 * @author Naftali Holland
 */
public class Employee{
	private int pfNumber;
	private String fName;
	private String LName;
	private String gender;
	/**
	 * Sets the employees pf number
	 */
	public Employee(int pf){
		pfNumber = pf;
	}
	/**
	 * Sets the employees first name
	 *
	 * @param fn string representation of the name
	 */
	public void setFName(String fn){
		fName = fn;
	}
	
	/**
	 * Sets the last name of the Employee
	 *
	 * @param ln string representation of the last name
	 */
	public void setLName(String ln){
		LName = ln;
	}

	/**
	 * Sets the gender of the employee
	 *
	 * @param gender value gender is set to
	 */
	public void setGender(String gender){
		this.gender = gender;
	}
	/**
	 * Displays information about the employee
	 */
	public void display(){
		System.out.println("pfNumber is " + pfNumber + "\nName is " + fName + LName + "\n Gender is " + gender);
	}
}
