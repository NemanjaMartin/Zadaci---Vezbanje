package domaciPetlje;

import java.util.Scanner;

public class DomaciWhile1 {

	public static void main(String[] args) {
		
		
	    Scanner sc = new Scanner(System.in);
	    
	    
	    
	    System.out.println("unesi broj");
	    int x = sc.nextInt();
	    int y = 0;
	    
	    while(y >= 0 ) {
	    	 
	    	
	    	if(x<0) {
	    		break;
	    	}
	    	
	    	System.out.println("unesi broj");
	    	
	 
	    	
	    	y = y + x;
	    	
	    	x = sc.nextInt();
	    		
	    	
	    	
	 	
	    }
	    System.out.println(y);
	}

}
