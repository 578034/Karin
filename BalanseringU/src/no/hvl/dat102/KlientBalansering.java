package no.hvl.dat102;

public class KlientBalansering {
	public static void main(String[] args) {
		final String filnavn = "ikkeBalansert.txt";
		// Leser inn en tekst fra fil
		Balansering balansering = new Balansering();
		balansering.lesFraFil(filnavn);
	}// main

}// class
