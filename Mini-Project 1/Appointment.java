/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Appointment Class *
*     Mini-Project 1    *
********************** */

public class Appointment {
	private String apptDateTime;
	private String patId;
	private String dentId;
	private String procCode;
	
	public Appointment() {
		apptDateTime = "";
		patId = "";
		dentId = "";
		procCode = "";
	}
	
	public Appointment(String apptDateTimeIn, String patIdIn, String dentIdIn,
					   String procCodeIn) {
		apptDateTime = apptDateTimeIn;
		patId = patIdIn;
		dentId = dentIdIn;
		procCode = procCodeIn;
	}
	
	public void setApptDateTime(String apptDateTimeIn) {
		apptDateTime = apptDateTimeIn;
	}
	
	public String getApptDateTime() {
		return apptDateTime;
	} 
	
	public void setPatId(String patIdIn) {
		patId = patIdIn;
	}
	
	public String getPatId() {
		return patId;
	}
	
	public void setDentId(String dentIdIn) {
		dentId = dentIdIn;
	}
	
	public String getDentId() {
		return dentId;
	}
	
	public void setProcCode(String procCodeIn) {
		procCode = procCodeIn;
	}
	
	public String getProcCode() {
		return procCode;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		return "" + getApptDateTime() + "\n" + getPatId() + "\n" +
						getDentId() + "\n" + getProcCode() + "\n";
	}
} //end class 