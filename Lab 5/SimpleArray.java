/* *********************
*   Alex Helfrich      *
*   Comp 1302-04       *
*   SimpleArray Class  *
*   Lab 5		       *
********************* */

public class SimpleArray {
	public static void main(String args[]) {
		int[] numberArr = new int[100];
		int start = 500;
		for (int i = 0; i < 100; i++) {
			numberArr[i] = start;
			start++;
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf(numberArr[i] + "\n");
		}
	} //end main
} //end class