/* ******************
*   Alex Helfrich   *
*   Comp 1302-04    *
*   Convert Class   *
*   Lab 5		    *
****************** */

import java.text.DecimalFormat;

public class Convert {
	public static void main(String args[]) {
		double[] fTemps = new double[21];
		double[] cTemps = new double[21];
		double faTemp = 0;
		double ceTemp = 0.0;
		
		DecimalFormat numberFormat = new DecimalFormat("#000.00");
		
		if (fTemps.length == cTemps.length) {
			for (int i = 0; i < fTemps.length; i++) {
				fTemps[i] = faTemp;
				ceTemp = ((faTemp - 32.0) / 1.8);
				faTemp += 25.0;
				cTemps[i] = ceTemp;
			}
			
			for (int i = 0; i < fTemps.length; i++) {
				String output = "" + numberFormat.format(fTemps[i]) + " | " + 
								numberFormat.format(cTemps[i]) + "\n";
				System.out.printf(output);
			}
		}	
	} //end main
} //end class