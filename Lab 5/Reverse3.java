/* *******************
*   Alex Helfrich    *
*   Comp 1302-04     * 
*   Reverse3 Class   *
*   Lab 5		     *
******************* */

public class Reverse3 {
	public static void main(String args[]) {
		char name[] = {'S', 't', 'e', 'v', 'e'};
		for (int i = 0; i < name.length; i++) {
			System.out.printf(name[i] + "\n");
		}
		reverse3(name);
	}
	
	public static void reverse3(char[] a) {
		for (int i = a.length - 1; i > -1; i--) {
			System.out.printf(a[i] + "\n");
		}
	}
}