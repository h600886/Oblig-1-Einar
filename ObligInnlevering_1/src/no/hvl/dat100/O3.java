package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		
		String nTxt = showInputDialog("Skriv inn et heltall:");
		int n = parseInt(nTxt);
		
		int nFak = 1;
		while (n>1) {
			nFak *= n;
			n--;
		}
		
		System.out.println("n!: " + nFak);

	}

}
