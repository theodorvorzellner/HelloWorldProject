package basics;

public class EinMalEins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \t ist ein Tabulator
		// \n ist new line = System.out.println(); System.out.print("\n");

		for (int i = 1; i < 11; i = i + 1) {
			if (i < 10)
			System.out.print("0"+i + "er Reihe:\t");
			if (i >= 10)
			System.out.print(i + "er Reihe:\t");
		// Das Programm muss das nur einnmal pro Reihe ausgeben
		// Das erste if sorgt für eine 0 am Anfang, damit es schöner aussieht, bei allen Zahlen die kleiner als 10 sind
		// Das zweite if gibt bei allen Zahlen, die mindestens 10 sind, dasselbe ohne diese 0 aus
			for (int j = 1; j < 11; j = j + 1) {
				System.out.print(i * j + "\t");
		// Hier werden die jeweiligen 10 Zahlen mit jeweils einem Tabulator ausgegeben
			}
			System.out.println();
		//Der Zeilenumbruch nach einer Reihe
		}
	}
}
