package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		
		double trinn0 = 0.0;
		double trinn1 = 1.7;
		double trinn2 = 4.0;
		double trinn3 = 13.2;
		double trinn4 = 16.2;
		
		int inntr1 = 184800;
		int inntr2 = 260100;
		int inntr3 = 651250;
		int inntr4 = 1021550;
		
		double trinnskatt;
		
		String inntektTxt = showInputDialog("Skriv inntekt i kr: ");
		int inntekt = parseInt(inntektTxt);
		
		if (inntekt < inntr1) {
			trinnskatt = inntekt / 100 * trinn0;
		} else if (inntr1 <= inntekt && inntekt < inntr2) {
			trinnskatt = (inntekt - inntr1) / 100 * trinn1;
		} else if (inntr2 <= inntekt && inntekt < inntr3) {
			trinnskatt = ((inntekt - inntr1) / 100 * trinn1) + ((inntekt - inntr2) / 100 * trinn2);
		} else if (inntr3 <= inntekt && inntekt < inntr4) {
			trinnskatt = ((inntekt - inntr1) / 100 * trinn1) + ((inntekt - inntr2) / 100 * trinn2) 
					+ ((inntekt - inntr3) / 100 * trinn3);
		} else{
			trinnskatt = ((inntekt - inntr1) / 100 * trinn1) + ((inntekt - inntr2) / 100 * trinn2) 
					+ ((inntekt - inntr3) / 100 * trinn3) + ((inntekt - inntr4) / 100 * trinn4);
		}
		
		String utTxt = "Din trinnskatt er: " + trinnskatt + "kr.";
		showMessageDialog(null, utTxt);

	}

}
