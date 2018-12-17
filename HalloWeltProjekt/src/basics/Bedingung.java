package basics;

public class Bedingung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool_var;
		bool_var = false;
		//
		if (bool_var == false) {
			System.out.println("1 - Bool Var ist falsch");

		}
		// achtung!!! Ist nur eine Zuweisung, kein Vergleich
		// daher muss bool war true sein damit sysout ausgeführt wird
		if (bool_var = false) {
			System.out.println("2 - Bool Var ist falsch");
		}
		//
		if (bool_var) {
			System.out.println("Bool Var ist wahr");
		}
		// ist dasselbe wie
		if (bool_var == true) {
			System.out.println("Bool Var ist wahr");
		}
		//
		//
		if (!bool_var) {
			System.out.println("Bool Var ist false");
		}
		// ist dasselbe wie
		if (bool_var == false) {
			System.out.println("Bool Var ist false");
		}
		// ist dasselbe wie
		if (bool_var != true) {
			System.out.println("Bool Var ist false");
		}
		//
		// wenn dann sonst
		if (bool_var) {
			System.out.println("wahr");
		} else {
			System.out.println("falsch");
		}
		//
		//
		if (true && true && true) {
			System.out.println("wahr");
		}
		//
		if (true && false && true) {
			System.out.println("nix");
		}
		//
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		//
		if (bool1 && bool2 && bool3) {
			System.out.println("alle 3 bools true");
		}
		// "&&" logisches UND
		// "||" logisches ODER
		if (bool1 || bool2 || bool3) {
			System.out.println("einer der 3 bools ist true");
		}

	}

}