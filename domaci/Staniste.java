package domaci;

import java.util.List;

public class Staniste {
	
	private List<Zivotinje> zivotinje;
	private String naziv;
	public Staniste(List<Zivotinje> zivotinje, String naziv) {
		super();
		this.zivotinje = zivotinje;
		this.naziv = naziv;
	}
	public List<Zivotinje> getZivotinje() {
		return zivotinje;
	}
	public void setZivotinje(List<Zivotinje> zivotinje) {
		this.zivotinje = zivotinje;
	}
	public String getNaziv() {
		return naziv;
	}
	
	
	
	

}
