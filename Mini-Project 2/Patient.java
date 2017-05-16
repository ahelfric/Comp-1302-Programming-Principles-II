/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Patient Class     *
*     Mini-Project 2    *
********************** */

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Exception;

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
	
	public void select(String identifier) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(
				"Patients.txt"));
			String line;
			
			while((line = in.readLine()) != null) {
				String[] interim = line.split(":");
				if (interim[0].compareTo(identifier) == 0) {
					super.setID(interim[0]);
					super.setPassword(interim[1]);
					super.setFirstName(interim[2]);
					super.setLastName(interim[3]);
					this.setAddr(interim[4]);
					super.setEmail(interim[5]);
					this.setInsCo(interim[6]);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} //Finds all pertinent info from the Patient.txt file
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(
				"Appointments"));
			String line;
			
			while((line = in.readLine()) != null) {
				String[] interim = line.split(":");
				if (super.getID().compareTo(interim[0]) == 0) {
					Appointment apTemp = new Appointment();
					apTemp.select(super.getID());
					this.setApt(apTemp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} //Finds the appointment pertaining to a patient, if one exists
	}
	
	public void insert(String IDIN, String passIn, String firstIn, String lastIn,
				       String addrIn, String eIn, String insCoIn) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
								"Patients.txt", true)));
			out.println(""); //assuming there is no empty line in the file
			out.print(IDIN + ":" + passIn + ":" + firstIn + ":" + lastIn + ":" + 
					  addrIn + ":" + eIn + ":" + insCoIn);
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
		output = (super.toString() + getAddr() + "\n" + getInsCo() + "\n"
				 + getApt().toString() + "\n");
		return output;
	}
	
	public static void main(String args[]) {
		Patient p1 = new Patient();
		p1.select("A901");
		p1.display();
	} //end main
} //end class