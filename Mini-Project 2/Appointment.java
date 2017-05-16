/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Appointment Class *
*     Mini-Project 2    *
********************** */

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Exception;

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
	
	public void select(String identifier) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(
				"Appointments.txt"));
			String line;
			
			while((line = in.readLine()) != null) {
				String[] interim = line.split(":");
				if (interim[0].compareTo(identifier) == 0) {
					this.setPatId(interim[0]);
					this.setApptDateTime(interim[1]);
					this.setDentId(interim[2]);
					this.setProcCode(interim[3]);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(String patIdIn, String apptDateTimeIn, String dentIdIn,
					   String procCodeIn) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
								"Appointments.txt", true)));
			out.println(""); //assuming that there is no empty line in the file
			out.print(patIdIn + ":" + apptDateTimeIn + ":" + dentIdIn 
						+ ":" + procCodeIn);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		return "" + getApptDateTime() + "\n" + getPatId() + "\n" +
						getDentId() + "\n" + getProcCode() + "\n";
	}
	
	public static void main(String args[]) {
		Appointment ar1 = new Appointment();
		ar1.select("A900");
		ar1.display();
		
		Appointment ar2 = new Appointment();
		ar2.insert("A912", "1/16/2016-4pm", "D202", "P###");
	}
} //end class 