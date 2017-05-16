/* ****************************
*	    Alex Helfrich         *
*        Comp 1302-04         *
*        Teller Class         *
*	    	Lab 2             *
**************************** */

public class Teller extends Employee {
	private double hoursWorked;
	private String shift;
	
	public Teller(){
		super();
		hoursWorked = 0.0;
		shift = "";
	}
	
	public Teller(int eNumberIn, String firstIn, String lastIn, 
					Address addrIn, String emailIn, double salaryIn,
					double hoursWorkedIn, String shiftIn) {
		super(eNumberIn, firstIn, lastIn, addrIn, emailIn, salaryIn);
		hoursWorked = hoursWorkedIn;
		shift = shiftIn;
	}
	
	public void setHoursWorked(double hoursWorkedIn) {
		hoursWorked = hoursWorkedIn;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public void setShift(String shiftIn) {
		shift = shiftIn;
	}
	
	public String getShift() {
		return shift;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + "\n" + 
				getAddress() + "\n" + getEmail() + "\n" + 
				getEmployeeIDNumber() + "\n" + getSalary() + "\n" +
				getHoursWorked() + "\n" + getShift() + "\n";
	}
}