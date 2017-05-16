/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Procedure Class   *
*     Mini-Project 1    *
********************** */

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
	
	public void display() {
		System.out.printf(this.toString());
	}
	
	public String toString() {
		return "" + getProcCode() + "\n" + getProcName() + "\n" + 
				 getProcDesc() + "\n" + getCost() + "\n";
	}
}