package domaci;

public class Ribe extends Zivotinje {
	private String voda;
	private String peraja;
	public Ribe(Vrsta vrsta, String naziv, String omiljenaHrana, String voda, String peraja) {
		super(vrsta, naziv, omiljenaHrana);
	    this.voda = voda;
	    this.peraja = peraja;
	    
	    
		
	}
	public String getVoda() {
		return voda;
	}
	public void setVoda(String voda) {
		this.voda = voda;
	}
	public String getPeraja() {
		return peraja;
	}
	public void setPeraja(String peraja) {
		this.peraja = peraja;
	}
	
	

}
