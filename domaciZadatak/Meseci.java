package domaciZadatak;

import java.util.Scanner;

/*
Napisati program koji na osnovu unetog naziva meseca ispisuje
 koliko ima meseci u godini koji pocinju na to slovo 	
*/            

public class Meseci {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Ispisati broj meseci koji pocinju na isto slovo za mesec, unesi mesec: ");
		Scanner sc = new Scanner(System.in);
		String mesec;
	    mesec = sc.nextLine();
		
	    
	    
	    
		switch(mesec)  {
		case "januar":
			System.out.println("3 meseca");
		    break;
		case "februar":
			System.out.println("Nijedan mesec");
			break;
		case "Mart":
		    System.out.println("2 meseca");
		    break;
		case "April":
			System.out.println("2 meseca");
			break;
		case "Maj":
			System.out.println("2 meseca");
			break;
		case "Jun":
			System.out.println("3 meseca");
			break;
		case "Jul":
			System.out.println("3 meseca");
			break;
		case"Avgust":
			System.out.println("2 meseca");
			break;
		case"Septembar":
			System.out.println("Nijedan mesec");
			break;
		case"Oktobar":
			System.out.println("Nijedan mesec");
			break;
		case"Novembar":
			System.out.println("Nijedan mesec");
			break;
		case"Decembar":
			System.out.println("Nijedan mesec");
			break;
			default:
				System.out.println("Unesite validni mesec");
			
			
			
			
		    
			
			
			
			
		
		
			
		
		}

	}

}
