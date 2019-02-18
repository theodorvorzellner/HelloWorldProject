package Rekursion;

public class Rekursion {

	public static void main(String[] args) {
		ausgabe1(90);

	}

	public static void ausgabe1(int zahl) {
		// Das ist eine Rekursion
		// das ist die Abbruchsbedingung
		if (zahl == 0)
			return;
		//
		zahl = zahl / 3;
		System.out.println(zahl);
		// rekursiver Aufruf
		ausgabe1(zahl);
	}

}
