/* *************************
*     Alex Helfrich        *
*     Comp 1302-04         *
*     ReadInts Class       *
*     Lab 4                *
************************* */

import java.io.*;

public class ReadInts {
	public ReadInts(String fileName) {
		File thisFile = new File(fileName);
		
		try {
			FileInputStream fn = new FileInputStream(thisFile);
			DataInputStream input = new DataInputStream(fn);
			
			while(input.available() > 0) {
				int x = input.readInt();
				System.out.println(x);
			} 
			
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String args[]) {
		ReadInts ri = new ReadInts("mydata.dat");
	} //end main
} //end class