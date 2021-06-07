package domaciZadatak;

import java.util.Scanner;

/* Napisati program koji proverava 
            da li je uneti broj paran.*/
public class ParniBroj {

	public static void main(String[] args) {      
		Scanner s = new Scanner(System.in);
		
	    int broj = s.nextInt();
	    
	    if(broj % 2 == 0)   {
	    System.out.println("Broj je paran");
	    
	    
	    }
	    
	    else {
	    	System.out.println("Broj nije paran");
	    }
                                                    



}

}
