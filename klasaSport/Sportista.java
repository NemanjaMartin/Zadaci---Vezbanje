package klasaSport;

public class Sportista {

	private String imeiPrezime;
	private String sport;
	private String klub;
	private int brojnaDresu;
	
	public Sportista(String imeiPrezime, String sport, String klub, int brojnaDresu) {
		this.imeiPrezime = imeiPrezime;
		this.sport = sport;
		this.klub= klub;
		this.brojnaDresu = brojnaDresu;
	}
	
	public String getImeiPrezime() {
		return imeiPrezime;
	}
	
	public String getSport() {
		return sport;
	}
	
	public String getKlub( ) {
		return klub;
	
	}
	public int getBrojnaDresu( ) {
		return brojnaDresu;
		
	}
	public void setBrojnaDresu(int brojnaDresu) {
	this.brojnaDresu = brojnaDresu; 
	
	}
	
	public void setKlub(String klub) {
		this.klub = klub;
	 
	}
	
	
	
	
	
		
		
		

	

}
