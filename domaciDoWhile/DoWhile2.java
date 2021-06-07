package domaciDoWhile;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int ceobroj = sc.nextInt();
		int cifra = 0;
		int kopija = ceobroj;
		int obrnuti = 0;
	
		while( ceobroj > 0)  {
			
			
		    cifra = ceobroj % 10;
		    System.out.print(cifra);
			ceobroj = ceobroj / 10;   
			obrnuti = obrnuti * 10 + cifra;
			
			
			
			
		}
		

		if(kopija == obrnuti) {
			 System.out.print(" Palindrom");
			
			}
		
			else   {
				
				System.out.print(" Nije palindrom");
			}
		
		
		
	}

}
