package firma;

public class GlavniProgram {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Zaposleni z1 = new Zaposleni("Ivan", "Pajkovic", "racunovodja", 1000);
		Zaposleni z2 = new Zaposleni("Dimitrije", "Pantic", "referent", 700);
		Zaposleni z3 = new Zaposleni("Srecko", "Sojic", "direktor", 1500);
		
		Zaposleni [] niz = {z1, z2, z3};
		
		
		Firma f1 = new Firma("digital tech", "Beograd", 2367, niz);
		Firma f2 = new Firma("Delta holding", "Novi beograd", 21342345,null);
		
		/*System.out.println(z1.getPrezime());
		System.out.println(f1.getZaposleni()[1].getPozicija());
		sb.append(f1.getZaposleni()[1].getPozicija());*/
		
		System.out.println(sb.toString());
		
		System.out.println(f1.getZaposleni()[0].getPrezime());
		System.out.println(f1.getZaposleni()[1].getPrezime());
		System.out.println(f1.getZaposleni()[2].getPrezime());
		
		

	}

}
