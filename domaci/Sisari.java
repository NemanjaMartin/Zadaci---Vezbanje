package domaci;

public class Sisari extends Zivotinje {
	private String bojaDlake;
	private String brojNogu;
	public Sisari(Vrsta vrsta, String naziv, String omiljenaHrana, String bojaDlake, String brojNogu) {
		super(vrsta, naziv, omiljenaHrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
		
		
		
	}
	public String getBojaDlake() {
		return bojaDlake;
	}
	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	public String getBrojNogu() {
		return brojNogu;
	}
	public void setBrojNogu(String brojNogu) {
		this.brojNogu = brojNogu;
	}
	
	
	

}
