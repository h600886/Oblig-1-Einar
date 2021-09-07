package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 90;
		int c = 80;
		int d = 60;
		int e = 50;
		int f = 40;
		
		String karakter;
		
		String poengTxt = showInputDialog("Skriv inn din poengsum");
		int poeng = parseInt(poengTxt);
		
		if (0 <= poeng && poeng < f) {
			karakter = "Du får karakteren F.";
		} else if (f <= poeng && poeng < e) {
			karakter = "Du får karakteren E.";
		} else if (e <= poeng && poeng < d) {
			karakter = "Du får karakteren D.";
		} else if (d <= poeng && poeng < c) {
			karakter = "Du får karakteren C.";
		} else if (c <= poeng && poeng < b) {
			karakter = "Du får karakteren B.";
		} else if (b <= poeng && poeng <= a) {
			karakter = "Du får karakteren A.";
		} else karakter=("Skriv inn gyldig verdi");
		
		System.out.println(karakter);
	}

}
