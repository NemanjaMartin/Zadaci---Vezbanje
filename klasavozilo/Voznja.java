package klasavozilo;

public class Voznja {

	public static void main(String[] args) {
		
	        Automobil a1 = new Automobil ("Mercedes", "C", 2334);
	        Automobil a2 = new Automobil ("Renault ", "Capture", 123234);
	        
	        String markaPrvogAuta = a1.getMarka();
	        
	        String modelPrvogAtua = a1.getModel();
	        
	        int serijskibrojPrvogAuta = a1.getserijskiBroj();
	        
            String markaDrugogAuta = a2.getMarka();
	        
	        String modelDrugogAuta= a2.getModel();
	        
	        int serijskibrojDrugogAuta = a2.getserijskiBroj();
	        
	        String Vlasnici = a1.getVlasnik();
		

	}

}
