package dogadjaj;

public class Dogadjaj {

	public static void main(String[] args) {
		
		
		Dvorana d1 = new Dvorana("Pionir", "Beograd", 1500);
		Dvorana d2 = new Dvorana("Kombank", "Beograd", 100000);
		
		Event e1 = new Event("19:00", d1, "Predavanje");
		Event e2 = new Event("20:00", d2, "Utakmica");
		
		System.out.println(e1.getDvorana().getNaziv() + " " + e1.getDvorana().getMesto());
		System.out.println( e2.getTip() + " " + e2.getDvorana().getMesto());
		
		d1.setNaziv("Arena");
		System.out.println(e1.getDvorana().getNaziv());
		
		
		
		

	}

}
