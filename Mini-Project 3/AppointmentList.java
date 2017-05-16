/* *****************************
*     Alex Helfrich   		   *
*     Comp 1302-04   		   *
*     AppointmentList Class    *
*     Mini-Project 3  		   *
***************************** */

public class AppointmentList {
	private Appointment[] list;
	private int count;
	
	public AppointmentList() {
		list = new Appointment[0];
		count = 0;
	}
	
	public void addAppointment(Appointment a) {
		Appointment[] interim = new Appointment[count + 1];
		for(int i = 0; i < count; i++) {
			interim[i] = list[i];
		}
		interim[count] = a;
		list = interim;
		count++;
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		String output = "";
		for(int i = 0; i < count; i++) {
			output = output + list[i].toString();
		}
		output += "\n";
		return output;
	}
}