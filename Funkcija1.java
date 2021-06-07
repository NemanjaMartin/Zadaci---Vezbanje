package funkcije;

import java.util.Scanner;

public class Funkcija1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int broj1 = sc.nextInt();
		int broj2 = sc.nextInt();
		int broj3 = sc.nextInt();
		
		int min =  minimum(broj1, broj2, broj3);
		System.out.println(min);
		

	}
	
	public static int minimum(int b1, int b2, int b3)  {
		int min = 0;
		
		if(b1< b2 && b1 < b3 )  {
			min = b1;
			return b1;
		} else if (b2 < b3 && b2 < b1 ) {
			min = b2;
			return b2;
		} else if(b3 < b1 && b3 < b2) {
			min = b3;
			return b3;
		}
		 return min;
	}
	

}
