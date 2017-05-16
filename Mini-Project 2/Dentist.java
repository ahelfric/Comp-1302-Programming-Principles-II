/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Dentist Class     *
*     Mini-Project 2    *
********************** */

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Exception;

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
	
	public void select(String identifier) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(
				"Dentists.txt"));
			String line;
			
			while((line = in.readLine()) != null) {
				String[] interim = line.split(":");
				if (interim[0].compareTo(identifier) == 0) {
					super.setID(interim[0]);
					super.setPassword(interim[1]);
					super.setFirstName(interim[2]);
					super.setLastName(interim[3]);
					super.setEmail(interim[4]);
					this.setOffice(interim[5]);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(
				"Appointments"));
			String line;
			
			while((line = in.readLine()) != null) {
				String[] interim = line.split(":");
				if (super.getID().compareTo(interim[2]) == 0) {
					Appointment apTemp = new Appointment();
					apTemp.select(super.getID());
					list.addAppointment(apTemp);
				}
			} //looks for dentist ID in appointments.txt, adds all appointments
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(String IDIN, String passIn, String firstIn, String lastIn,
				       String eIn, String officeIn) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
								"Dentists.txt", true)));
			out.println(""); //assuming there is no empty line in the file
			out.print(IDIN + ":" + passIn + ":" + firstIn 
						+ ":" + lastIn + ":" + eIn + ":" + officeIn);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		String output;
		output = super.toString() + getOffice() + "\n" + list.toString();
		return output;
	}
	
	public static void main(String args[]) {
		Dentist d1 = new Dentist();
		d1.select("D201");
		d1.display()
	} //end main
} //end class