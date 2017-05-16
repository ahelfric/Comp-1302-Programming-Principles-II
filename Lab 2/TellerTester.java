/* ****************************
*	    Alex Helfrich         *
*        Comp 1302-04         *
*     Teller Tester Class     *
*	    	Lab 2             *
**************************** */

public class TellerTester {
	public static void main(String args[]) {
		Teller et1 = new Teller(2323, "Bill", "Clinton", new Address("123 Main",
						  "Atlanta", "GA", 30111), "bc@msn.com", 43000.00,
						  30.3, "Day");
		et1.display();
	}
}