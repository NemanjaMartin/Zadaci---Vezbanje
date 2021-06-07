package klasaSport;

public class Igraci {

	public static void main(String[] args) {
		
		Sportista i1 = new Sportista(" Dejan Stankovic", "Fudbal", "Inter", 11);
		Sportista i2 = new Sportista("Dule Savic", "Fudbal", "Crven Zvezda", 7);
		Sportista i3 = new Sportista("Milenko", "Vaterpolo", "Plavaci", 2);
		Sportista i4 = new Sportista("dragan Tomasevic", "Kosarka", "Kenguri" , 10);
		
		
		String prviIgrac = i1.getImeiPrezime();
		System.out.println(prviIgrac);
		System.out.println(i1.getBrojnaDresu());
		System.out.println(i1.getKlub());
		i1.setKlub("Plavi");
		
		System.out.println(i1.getKlub());

	}

}
