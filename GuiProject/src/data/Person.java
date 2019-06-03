package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.ibm.icu.impl.UResource.Array;

public class Person {
	//
	private static ArrayList<Person> personenListe = new ArrayList<>();
	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}

	//
	@Expose(serialize=true, deserialize=true)
	private String Vorname;
	@Expose(serialize=true, deserialize=true)
	private String Nachname;
	@Expose(serialize=true, deserialize=true)
	private String PLZ;
	@Expose(serialize=true, deserialize=true)
	private String Ort;
	@Expose(serialize=true, deserialize=true)
	private String Straﬂe;
	@Expose(serialize=true, deserialize=true)
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
	public static void loadPersonenFromFile(String filename) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		gson.serializeNulls();
		//
		FileReader fr;
		try {
			//
			fr = new FileReader(filename);
			//
			Person[] personen = gson.fromJson(fr, Person[].class);
			personenListe = new ArrayList<Person>(Arrays.asList(personen));
			System.out.println(gson.toJson(personenListe));
			//
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			
		}
		
	}
}
