package firma;

public class Firma{
	
	private String naziv;
	private String sediste;
	private int pib;
	private Zaposleni [] zaposleni;
	public Firma(String naziv, String sediste, int pib, Zaposleni[] zaposleni) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSediste() {
		return sediste;
	}
	public int getPib() {
		return pib;
	}
	public Zaposleni [] getZaposleni() {
		return zaposleni;
	}
	
	

}
