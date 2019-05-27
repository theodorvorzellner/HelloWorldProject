package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> personenListe = new ArrayList<>();
	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}

	//
	private String Vorname;
	private String Nachname;
	private String PLZ;
	private String Ort;
	private String Straﬂe;
	private String Hausnummer;
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	public String getPLZ() {
		return PLZ;
	}
	public void setPLZ(String pLZ) {
		PLZ = pLZ;
	}
	public String getOrt() {
		return Ort;
	}
	public void setOrt(String ort) {
		Ort = ort;
	}
	public String getStraﬂe() {
		return Straﬂe;
	}
	public void setStraﬂe(String straﬂe) {
		Straﬂe = straﬂe;
	}
	public String getHausnummer() {
		return Hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		Hausnummer = hausnummer;
	}

	@Override
	public String toString() {
		return getNachname() + "," + getVorname() + "("
				+ getPLZ() + " " + getOrt() + ", " + 
				getStraﬂe() + " " + getHausnummer() + ")";
	}
}
