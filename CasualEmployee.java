/**
 * this is a class representing the implementation of a casual worker that inherits
 * from the class Employee
 * @author Naftali Holland
 */
public class CasualEmployee extends Employee{
	private double hourlyRate;
	private double hoursWorked;
	/**
	 * Calls the constructor of the super class (Employee)
	 * @param pf The employee number
	 */
	public CasualEmployee(int pf)
	{
		//calling the constructor in the super class Employee
		super(pf);
	}
	/**
	 * Sets the hourlyRate attribute
	 * @param hourlyRate The value that is hourlyRate is set to
	 */
	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	/**
	 * Sets the hoursWorked attribute
	 * @param hoursWorked The value hoursWorked is set to
	 */
	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	/**
	 * Calculates the amount the employee is paid
	 * @return The amount the employee is paid
	 */
	public double getPay(){
		return (hourlyRate * hoursWorked);
	}
	/**
	 * overriding the display() method to add the amount paid
	 */
	@Override
	public void display(){
		//calling the method before overinding it
		super.display();
		System.out.println("is paid " + getPay());
	}
}
