/* *************************
*     Alex Helfrich        *
*     Comp 1302-04         *
*     WriteString Class    *
*     Lab 4                *
************************* */

import java.io.*;

public class WriteString {
	public WriteString(String nameIn, String inputText) {
		try {
			File f1 = new File(nameIn);
			if (f1.exists() == true) {
				FileOutputStream fout = new FileOutputStream(f1);
				PrintStream ps = new PrintStream(fout);
				ps.println(inputText);
			}
		}
		catch (IOException ie) {
			System.out.println(ie);
		}
	}
	
	public static void main(String args[]) {
		WriteString ws = new WriteString("f1.txt", "Hello worlds");
	} //end main
} //end class