/* ****************************
*	    Alex Helfrich         *
*        Comp 1302-04         *
*        Employee Class       *
*	    	   Lab 2          *
**************************** */

public class Employee extends Person {
	private int eNumber; //Employee ID number
	private double salary;
	
	public Employee() 
	{
		super();
		eNumber = 0;
		salary = 0.0;
	}
	
	public Employee(int eNumberIn, String firstIn, String lastIn, 
					Address addrIn, String emailIn, double salaryIn) 
	{
		super(firstIn, lastIn, addrIn, emailIn);
		eNumber = eNumberIn;
		salary = salaryIn;
	}
	
	public void setEmployeeIDNumber(int eNumberIn) {
		eNumber = eNumberIn;
	}
	
	public int getEmployeeIDNumber() {
		return eNumber;
	}
	
	public void setSalary(double salaryIn) {
		salary = salaryIn;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		String output = getFirstName() + " " + getLastName() + "\n" + 
						getAddress() + "\n" + getEmail() + "\n" + 
						getEmployeeIDNumber() + "\n" + getSalary() + "\n";
		return output; 
	}
	
	public static void main(String args[]) {
		Employee e1;
		e1 = new Employee(2323, "Bill", "Clinton", new Address("123 Main",
						  "Atlanta", "GA", 30111), "bc@msn.com", 43000.00);
		e1.display();
	}
}