package domaci;

import java.util.Scanner;

public class Niz1 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);

	        System.out.println("Unesite velicinu niza:");
	        int n = sc.nextInt();
	        int[] niz = new int[n];


	        for (int i = 0; i < niz.length; i++) {
	            System.out.println("Unesite " + (i + 1) + ". element niza");
	            niz[i] = sc.nextInt();
	        }

	        if (palindrom(niz)) System.out.println("Niz je palindrom");
	        else System.out.println("Niz nije palindrom");


	    }

	    public static boolean palindrom(int[] niz) {

	        boolean fleg = true;

	        for (int i = 0; i < niz.length / 2; i++) {
	            if (niz[i] != niz[niz.length - 1 - i]) {
	                fleg = false;
	                break;
	            }
	
	        }
	        return fleg;
	    }
	}

			
		 

	