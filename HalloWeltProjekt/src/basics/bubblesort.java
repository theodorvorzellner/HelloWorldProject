package basics;

public class bubblesort {

	public static void main(String[] args) {

		int[] zahlen = { 3, 6, 1, 9, 2, 5 };

		for (int i = 0; i < zahlen.length; i++) {

			System.out.println(zahlen[i]);

		}

		for (int j = zahlen.length; j > 1; j--) {
			for (int i = 0; i < (j - 1); i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					int l = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = l;
				}
			}

		}
		System.out.println();
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
	}
}