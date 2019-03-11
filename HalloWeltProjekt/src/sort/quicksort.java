package sort;

public class quicksort {

	//static int[] zahlen = { 9, 2, 5, 1, 10, 7, 4, 6, 3 };
	// Geht nicht in der Reihenfolge oben!
	static int[] zahlen = { 9, 2, 5, 1, 7, 10, 6, 4, 3 };

	public static void main(String[] args) {

		System.out.println("Unsortierte Zahlen" + "\n");
		for (int k = 0; k < zahlen.length; k++) {

			System.out.println(zahlen[k]);
		}

		quicksorter(0, zahlen.length -1);

		System.out.println("\n" + "Sortierte Zahlen" + "\n");
		for (int k = 0; k < zahlen.length; k++) {

			System.out.println(zahlen[k]);

		}
	}
	

	public static void quicksorter(int links, int rechts) {
		if (links < rechts) {
			int teiler = teile(links, rechts);
			quicksorter(links, teiler - 1);
			quicksorter(teiler + 1, rechts);
		}
	}

	public static int teile(int links, int rechts) {
		int i = links;
		int j = rechts - 1;
		int pivot = zahlen[rechts];

		do {

			while (i < rechts - 1 && zahlen[i] < pivot) {
				i++;
			}
			while (j > links && zahlen[j] >= pivot) {
				j--;
			}
			if (i < j) {
				int z = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = z;
			}
		} while (i < j);
		if (zahlen[i] > pivot) {
			int y = zahlen[i];
			zahlen[i] = pivot;
			zahlen[rechts] = y;

		}

		return i;

	}
}
