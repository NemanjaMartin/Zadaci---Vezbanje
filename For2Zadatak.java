package domaciFor;

import java.util.Scanner;

public class For2Zadatak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int broj = sc.nextInt();
		int zbir = 0;
		
		
		for(int n = 1; n<=broj; n = n + 1)  {
			
			if (n % 5 == 0)  {
				continue;
				
           
			} else if (n < 13) {
				
				   zbir = zbir + n;
					
					System.out.println(zbir);
				
			}
			
			   
			
			
			
		}

	}

}
