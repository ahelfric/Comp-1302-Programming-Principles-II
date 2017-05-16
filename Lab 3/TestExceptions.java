/* *************************
*    Alex Helfrich         *
*    Comp 1302-04          *
*    TestExceptions Class  *
*    Lab 3                 *
************************* */

import java.lang.ArithmeticException;

public class TestExceptions {
	
	public static void main(String args[]) {
		try {
			int[] myArr = new int[10];
			int x,y,z;
			x = 0;
			y = 10;
			z = y/x;
		
			myArr[10] = 0;
		}
		catch(ArithmeticException e) {
			System.out.println("**Divide by Zero Error**");
		}
		
	} //end main
} //end class