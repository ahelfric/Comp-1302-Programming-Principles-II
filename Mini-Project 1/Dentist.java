/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Dentist Class     *
*     Mini-Project 1    *
********************** */

public class Dentist extends Person {
	private String office;
	private AppointmentList list;
	
	public Dentist() {
		super();
		office = "";
	}
	
	public Dentist(String IDIN, String passIn, String firstIn, String lastIn,
				   String eIn, String officeIn) {
		super(IDIN, passIn, firstIn, lastIn, eIn);
		office = officeIn;
	}
	
	public void setOffice(String officeIn) {
		office = officeIn;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		String output;
		output = super.toString() + getOffice() + "\n" + list.toString();
		return output;
	}
} //end class