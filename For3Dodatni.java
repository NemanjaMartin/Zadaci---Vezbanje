package domaciFor;

import java.util.Scanner;

public class For3Dodatni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj:");
		int broj = sc.nextInt();

		for (int i=broj; i>=1; i--) {

			for (int j = broj; j>i; j--) {

				System.out.println(" ");
			}
			for (int k=1; k<=i; k++) {

				System.out.print("*");
			}

		} 
			System.out.println("");
		
	     
	

	}

}
