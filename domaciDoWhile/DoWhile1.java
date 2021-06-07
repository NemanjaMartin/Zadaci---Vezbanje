package domaciDoWhile;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxsuma = sc.nextInt();
		System.out.println("Unesi maksimalnu sumu: " + maxsuma);
		
		 
		int limitsuma = maxsuma - 89;
		int brojpoklona = 0;
		
		
		
		do  {
			
			int poklon = sc.nextInt();
			 limitsuma = limitsuma - poklon;
			 maxsuma = maxsuma - poklon;
			 System.out.println(limitsuma);
			brojpoklona = brojpoklona + 1;
			 
			
		
	
		}  while(limitsuma > 0 );
		
		if (  limitsuma < 0 )  {
			System.out.println("Nema dovoljno novca"); 
			   }
		
		else {
			
			System.out.println(maxsuma + " " + " mi je za bus plus");
		}
		
		System.out.println("broj poklona je " +brojpoklona);

	}

}
