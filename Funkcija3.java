package funkcije;

import java.util.Scanner;

public class Funkcija3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int broj1 = sc.nextInt();
		int broj2 = sc.nextInt();
		int broj3 = sc.nextInt();
		
		int rez = zbir(broj1, broj2, broj3);
		System.out.println("Zbir je " + rez);
		int maks = maksimum(broj1, broj2, broj3 );
		System.out.println("Maksimalan broje je" + maks);

	}
	
	 public static int zbir(int b1, int b2, int b3) {
	    	System.out.println("Ispisi brojeve " + b1 + "," + b2 + "," +  b3);
	    	int c = b1 + b2 + b3;
	    	System.out.println("Ispisi rezultat: " + c);
	    	return c;
	    	
	    }
	 public static int maksimum(int b1, int b2, int b3)  {
			int max = 0;
			
			if(b1 > b2 && b1 > b3 )  {
				max= b1;
				return b1;
			} else if (b2 > b3 && b2 > b1 ) {
				max = b2;
				return b2;
			} else if(b3 > b1 && b3 >b2) {
				max = b3;
				return b3;
			}
			 return max;

	 }
}