package basics;

public class bubblesort {

	public static void main(String[] args) {

		int[] zahlen = { 3, 6, 1, 9, 2, 5 };
		System.out.println("Unsortierte Zahlen" + "\n");
		for (int i = 0; i < zahlen.length; i++) {
			
			System.out.println(zahlen[i]);

		}

		System.out.println("\n" + "----------------");
		
		for (int j = zahlen.length; j > 1; j--) {
			for (int i = 0; i < (j - 1); i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					int l = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = l;
				}
			}

		}
		System.out.println("\n" + "Sortierte Zahlen" + "\n");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
	}
}