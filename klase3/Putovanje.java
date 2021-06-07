package klase3;

import java.util.List;

public class Putovanje {
	
	private String destinacija;
	private int cena;
	private List<Putnici> putnici;
	
	public Putovanje(String destinacija, int cena, List<Putnici> putnici) {
		super();
		this.destinacija = destinacija;
		this.cena = cena;
		this.putnici = putnici;
		
		
	}
	public Putovanje(String destinacija, int cena) {
		super();
		this.destinacija = destinacija;
		this.cena = cena;
		
		
	}
	public String getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public List<Putnici> getPutnici() {
		return putnici;
	}
	public void setPutnici(List<Putnici> putnici) {
		this.putnici = putnici;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

	

}
