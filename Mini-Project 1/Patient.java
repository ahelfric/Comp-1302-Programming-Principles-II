/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Patient Class     *
*     Mini-Project 1    *
********************** */

public class Patient extends Person {
	private String addr;
	private String insCo;
	private Appointment patAppt;
	
	public Patient() {
		super();
		addr = "";
		insCo = "";
		patAppt = new Appointment();
	}
	
	public Patient(String IDIN, String passIn, String firstIn, String lastIn,
				  String eIn, String addrIn, String insCoIn, Appointment apIn) {
		super(IDIN, passIn, firstIn, lastIn, eIn);
		addr = addrIn;
		insCo = insCoIn;
		patAppt = apIn;
	}
	
	public void setAddr(String addrIn) {
		addr = addrIn;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setInsCo(String insCoIn) {
		insCo = insCoIn;
	}
	
	public String getInsCo() {
		return insCo;
	}
	
	public void setApt(Appointment apIn) {
		patAppt = apIn;
	}
	
	public Appointment getApt() {
		return patAppt;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		String output;
		output = (super.toString() + getAddr() + "\n" + getInsCo() + "\n"
				 + getApt().toString() + "\n");
		return output;
	}
} //end class