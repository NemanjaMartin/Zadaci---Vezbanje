package domaci;

import java.util.ArrayList;
import java.util.List;

public class Glavni {

	public static void main(String[] args) {
		
		List<Zivotinje> zivotinje = new ArrayList<Zivotinje>();
		
		
		Vrsta v1 = new Vrsta("Planinski", "pasa", "Predator");
		Vrsta v2 = new Vrsta("mekoperka", "Saran", "pitomac" );
		Zivotinje z1 = new Zivotinje(v1, "Vuk", "meso");
		
		
		Ribe r1 = new Ribe(v2, "Saran", "biljna hrana", "Slatka voda", "ledjna peraja" );
		Sisari s1 = new Sisari(v1, "Vuk", "meso", "sivo-bela", "Cetiri");
		
		zivotinje.add(r1);
		zivotinje.add(s1);
		
		Staniste st1 = new Staniste(zivotinje, "Planina");
		Staniste st2 = new Staniste(zivotinje, "reka");
		
	    r1.getVrsta();
	    System.out.println( r1.getVrsta().getRod());
	    
	    System.out.println(r1.getVrsta().toString());
	    
	    System.out.println(st2.getNaziv());
	    
	   
	    
	    if(zivotinje.get(1) instanceof Sisari) {
	    	Sisari s = (Sisari) zivotinje.get(1);
	    	s.setBojaDlake("Bela");
	        System.out.println(s.getBojaDlake());
	    	
	    }
				
				

	}

}
