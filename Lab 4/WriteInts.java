/* *************************
*     Alex Helfrich        *
*     Comp 1302-04         *
*     WriteInts Class      *
*     Lab 4                *
************************* */

import java.io.*;

public class WriteInts {
	public WriteInts(String nameIn, int[] myArr) {
		try {
			File f1 = new File(nameIn);
			if (f1.exists() == true) {
				FileOutputStream fout = new FileOutputStream(nameIn);
				DataOutputStream dout = new DataOutputStream(fout);
				for(int i = 0; i < myArr.length; i++) {
					dout.writeInt(myArr[i]);
				}
			}
		}
		catch (IOException ie) {
			System.out.println(ie);
		}
	}
	
	public static void main(String args[]) {
		int myArr[] = {16,31,90,45,89};
		WriteInts wi = new WriteInts("mydata.dat", myArr);
	} //end main
} //end class

