package basics;

public class Zahlen1bis1000durch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;
		for (int i = 1; i < 1001; i = i + 1) {
			if ((i % 6) == 0)
				j = j + 1;
		}

		System.out.println(j);

	}
}
