public class Gnome {

	public static void main(String[] args) {
		System.out.println("5478963210");

		int mass[] = { 5, 4, 7, 8, 9, 6, 3, 2, 1, 0 };

		for (int q = 1; q < mass.length;) {

			if (mass[q - 1] <= mass[q]) {
				q++;
			} else {
				int w = mass[q];
				mass[q] = mass[q - 1];
				mass[q - 1] = w;
				q--;
			}

			if (q == 0) {
				q = 1;
			}

		}

		for (int e = 0; e < mass.length; e++) {
			System.out.print(mass[e]);
		}
	}
}