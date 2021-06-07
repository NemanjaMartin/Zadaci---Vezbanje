package funkcije;

import java.util.Scanner;

public class Funkcija2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			int broj1 = sc.nextInt();
			int broj2 = sc.nextInt();
			int broj3 = sc.nextInt();
			
			int rez = proizvod(broj1, broj2, broj3);
			System.out.println("Vracen u main rezultat " + rez);
			
			
		}
		    public static int proizvod(int broj1, int broj2, int broj3) {
		    	System.out.println("Ispisi brojeve " + broj1 + "," + broj2 + "," +  broj3);
		    	int c = broj1 * broj2 * broj3;
		    	System.out.println("Ispisi rezultat: " + c);
		    	return c;
		    	
		    }


	}


