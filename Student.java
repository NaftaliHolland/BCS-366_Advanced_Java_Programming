public class Student
{
	// attributes
	private String regNumber;
	private String firstName;
	private String lastName;
	private String gender;
	private int phoneNumber;
	//methods
	public Student(String regNumber){
		this.regNumber = regNUmber;
	}

	public void setDetails(String fn, string, String gender, int phone){
		firstName = fn;
		lastName = ln;
		this.gender = gender;
		phoneNumber = phone;
	}
	public void display(){
		System.out.println("First Name " + firstName);
		System.out.println("Last Name " + lastName);
		System.out.println("RegNO " + regNumber);
		System.out.println("Phone number " + phoneNumber);
	}
