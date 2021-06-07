package domaciZadatak;

import java.util.Scanner;

public class PovrsinaSobeGrananje {

	/* zadatak od 15.4.2021. uraditi ponovo
	 *   koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina */

	
	public static void main(String[] args) {
		
		
System.out.println("Unesite ivice sobe:");
		
		Scanner s = new Scanner(System.in);
		
	   
	    System.out.println("Unesite ivicu broj 1:");
	    System.out.println("Unesite ivicu broj 2:");
	    System.out.println("Unesite ivicu broj 3:");
	    
	    int ivica1 = s.nextInt();
	    int ivica2 = s.nextInt();
	    int ivica3 = s.nextInt();
	    int x = 2*ivica1*ivica2 + 2*ivica2*ivica3 + 2*ivica1*ivica3;
	    
	    
	    
	    if( ivica1 == 5 && ivica2 == 3 && ivica3 == 2)  {
	    	
	    	System.out.println("Povrsina sobe je " + x);
	    }
	    else  {
	    	System.out.println("Nemoguca povrsina");
	    	
	    }
	   
	    
	    
	    
	    
	}

}
