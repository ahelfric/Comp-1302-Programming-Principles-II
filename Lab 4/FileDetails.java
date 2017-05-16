/* *************************
*     Alex Helfrich        *
*     Comp 1302-04         *
*     FileDetails Class    *
*     Lab 4                *
************************* */

import java.io.File;

public class FileDetails {
	boolean writeable;
	boolean readable;
	String fileName;
	long sz;
	
	public FileDetails(String nameIn) {
		fileName = nameIn;
		File f1 = new File(fileName);
		sz = f1.length();
		writeable = f1.canWrite();
		readable = f1.canRead();
		System.out.printf("" + fileName + "\nFile Size: " + sz + "\nWriteable: " +
						  writeable + "\nReadable: " + readable + "\n");
	}
	public static void main(String[] args) {
		FileDetails fd = new FileDetails("anyfile.doc");
	} //end main
} //end class

/* 
File f1;
f1 = new File("ron1.txt");
long sz = f1.length();
boolean b1 = f1.canWrite();

FileOutputStream fout = new FileOutputStream(f1);
PrintStream ps = new PrintStream(fout);
ps.println("Hello");

Don't forget to put all of this in a try catch block to find an ioException

try{
	jklf jadskf
}
catch (IOException ie) {
	System.out.println(ie);
}

FileOutputStream fout = new FileOutputStream("ron1.text");
DataOutputStream dout = new DataOutputStream(fout);
dout.writeInt(6);

Steams - a flow of data
Stream classes are used to write to more than just files (i.e networds)
streams are single dxn
what data, and where am I going to write it to?
i.e. We want to write a String to a file; or a int to a network. etc. etc.
PrintStream to FileOutputStream
DataOutputStream to FileOutputStream;
*/

