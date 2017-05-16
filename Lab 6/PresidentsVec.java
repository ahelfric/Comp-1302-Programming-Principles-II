/* ************************
*    Alex Helfrich        *
*    Comp 1302-04         *
*    PresidentsVec Class  *
*    Lab 6                *
************************ */

import java.util.Vector;
import java.util.Scanner;

public class PresidentsVec {
	private Vector<String> presList;
	
	public PresidentsVec () {
		presList = new Vector<String>();
		
		presList.addElement("George Washington");
		presList.addElement("John Adams");
		presList.addElement("Thomas Jefferson");
		presList.addElement("James Madison");
		presList.addElement("James Monroe");
		presList.addElement("John Quincy Adams");
		presList.addElement("Andrew Jackson");
		presList.addElement("Martin Van Buren");
		presList.addElement("William H. Harrison");
		presList.addElement("John Tyler");
	}
	
	public static void main(String args[]) {
		PresidentsVec presVec = new PresidentsVec();
		
		System.out.printf("Enter which president: ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt() - 1; 
		System.out.printf(presVec.presList.get(index) + "\n");
	} //end main
} //end class