package basics;

public class Schleife04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zahl1 = 120;
		int zahl2 = zahl1;

		while (zahl1 > 0) {
			if (zahl2 % zahl1 == 0)
				System.out.println(zahl1);
			zahl1 = zahl1 - 1;

		}

	}

}
