/* **********************
*     Alex Helfrich     *
*     Comp 1302-04      *
*     Recursion Class   *
*     Lab 5		        *
********************** */

public class Recur {
	private int count = 0;
	public void methRecur() {
		while(count < 100) {
			count++;
			this.methRecur();
		}
		System.out.printf("Leaving Method");
	}
} //end class