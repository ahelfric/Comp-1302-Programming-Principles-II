/* ****************************
*	    Alex Helfrich         *
*        Comp 1302-04         *
*        Student Class        *
*	         Lab 2            *
**************************** */

public class Student extends Person {
	private int stuID; //Student ID Number;
	private String major;
	private double gpa;
	
	public Student() 
	{
		super();
		stuID = 0;
		major = "";
		gpa = 0.0;
	}
	
	public Student(String firstIn, String lastIn, Address addrIn, 
				   String emailIn, int stuIDIn, String majorIn, double gpaIn) 
	{
		super(firstIn, lastIn, addrIn, emailIn);
		stuID = stuIDIn;
		major = majorIn;
		gpa = gpaIn;
	}
	
	public void setStudentIDNumber(int stuIDIn) {
		stuID = stuIDIn;
	}
	
	public void setStudentMajor(String majorIn) {
		major = majorIn;
	}
	
	public void setStudentGPA(double gpaIn) {
		gpa = gpaIn;
	}
	
	public int getStudentIDNumber() {
		return stuID;
	}
	
	public String getStudentMajor() {
		return major;
	}
	
	public double getStudentGPA() {
		return gpa;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		String output = getFirstName() + " " + getLastName() + "\n" + 
						getAddress() + "\n" + getStudentIDNumber() + "\n" + 
						getStudentMajor() + "\n" + getStudentGPA() + "\n";
		return output; 
	}
	
	public static void main(String args[]) {
		Student t1;
		t1 = new Student("Bill", "Nye the Science Guy", new Address(
						  "7475 Science Avenue", "Space City", "Spaaace",
						  10101), "BillBillBillBill@Bill.net", 103384293,
						  "Master of Science", 4.0);
		t1.display();
	}
}