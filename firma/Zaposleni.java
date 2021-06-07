package firma;

public class Zaposleni {
	
	private String ime;
	private String prezime;
	private  String pozicija;
	private int mesecnaPrimanja;
	public Zaposleni(String ime, String prezime, String pozicija, int mesecnaPrimanja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.mesecnaPrimanja = mesecnaPrimanja;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getMesecnaPrimanja() {
		return mesecnaPrimanja;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
