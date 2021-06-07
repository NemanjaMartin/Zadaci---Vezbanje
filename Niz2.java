package domaci;

public class Niz2 {

	public static void main(String[] args) {
		int[] niz = { 7, 2, 4, 1, 3 };

		mnozenje(niz);

	}

	public static void mnozenje(int[] niz) {
		int proizvod = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i > niz[i]) {
				continue;
			}
			 
			proizvod = proizvod * niz[i];
			

		}
		System.out.println(proizvod);
	}

}
