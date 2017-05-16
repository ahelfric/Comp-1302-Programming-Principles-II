/* ************************
*    Alex Helfrich        *
*    Comp 1302-04         *
*    PresidentsAA Class   *
*    Lab 6                *
************************ */

import java.util.ArrayList;
import java.util.Scanner;

public class PresidentsAA {
	private ArrayList<String> presList;
	
	public PresidentsAA() {
		presList = new ArrayList<String>();
		
		presList.add("George Washington");
		presList.add("John Adams");
		presList.add("Thomas Jefferson");
		presList.add("James Madison");
		presList.add("James Monroe");
		presList.add("John Quincy Adams");
		presList.add("Andrew Jackson");
		presList.add("Martin Van Buren");
		presList.add("William H. Harrison");
		presList.add("John Tyler");
	}
	
	public static void main(String args[]) {
		PresidentsAA presAA = new PresidentsAA();
		
		System.out.printf("Enter which president: ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt() - 1; 
		System.out.printf(presAA.presList.get(index) + "\n");
	} //end main
} //end class