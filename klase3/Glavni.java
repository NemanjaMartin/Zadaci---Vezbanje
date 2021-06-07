package klase3;

import java.util.ArrayList;
import java.util.List;

public class Glavni {

	public static void main(String[] args) {
		List<Putnici> putnici1 = new ArrayList<Putnici>();
		
		Putnici p1 = new Putnici("Mika", "Panajotovic", 12345678 );
		Putnici p2 = new Putnici("Miloje", "Pantic", 12345678);
		
		Putovanje d1 = new Putovanje("Leptokaria", 150, putnici1);
		Putovanje d2 = new Putovanje("Pefkohori", 200, putnici1);
		Putovanje d3 = new Putovanje("Evia", 250);
		
		putnici1.add(p1);
		putnici1.add(p2);
		
		List<Putovanje> ponuda = new ArrayList<Putovanje>();
		ponuda.add(d1);
		ponuda.add(d2);
	    ponuda.add(d3);
	    
	    
	    System.out.println(ponuda.get(2).getCena());
	    ponuda.get(2).setCena(200);
	    System.out.println(ponuda.get(2).getCena());
	    System.out.println(ponuda.size());
	    ponuda.remove(2);
	    System.out.println(ponuda.size());
	    
	    putnici1.remove(1);
		System.out.println(putnici1.get(0).getIme());
	    

	}

}
