/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Procedure Class   *
*     Mini-Project 2    *
********************** */

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Exception;

public class Procedure {
	private String procCode;
	private String procName;
	private String procDesc;
	private double cost;
	
	public Procedure() {
		procCode = "";
		procName = "";
		procDesc = "";
		cost = 0.0;
	}
	
	public Procedure(String procCodeIn, String procNameIn, String procDescIn,
					 double costIn) {
		procCode = procCodeIn;
		procName = procNameIn;
		procDesc = procDescIn;
		cost = costIn;
	}
	
	public void setProcCode(String procCodeIn) {
		procCode = procCodeIn;
	}
	
	public String getProcCode() {
		return procCode;
	}
	
	public void setProcName(String procNameIn) {
		procName = procNameIn;
	}
	
	public String getProcName() {
		return procName;
	}
	
	public void setProcDesc(String procDescIn) {
		procDesc = procDescIn;
	}
	
	public String getProcDesc() {
		return procDesc;
	}
	
	public void setCost(double costIn) {
		cost = costIn;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void select(String identifier) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(
				"Procedures.txt"));
			String line;
			
			while((line = in.readLine()) != null) {
				String[] interim = line.split(":");
				if (interim[0].compareTo(identifier) == 0) {
					this.setProcCode(interim[0]);
					this.setProcName(interim[1]);
					this.setProcDesc(interim[2]);
					this.setCost(Double.parseDouble(interim[3]));
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(String procCodeIn, String procNameIn, String procDescIn,
					   double costIn) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
								"Procedures.txt", true)));
			out.println(""); //assuming there is no empty line in the file
			out.print(procCodeIn + ":" + procNameIn + ":" + procDescIn 
						+ ":" + costIn);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //method only inserts at the end of the file, not in any particular order
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		return "" + getProcCode() + "\n" + getProcName() + "\n" + 
				 getProcDesc() + "\n" + getCost() + "\n";
	}
	
	public static void main(String args[]) {
		Procedure pr1 = new Procedure();
		pr1.select("P114");
		pr1.display();
		
		Procedure pr2 = new Procedure();
		pr2.insert("P119", "Polish", "Polish Teeth", 199.99);
	} //end main
} //end class