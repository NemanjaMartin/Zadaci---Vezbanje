package domaci;

public class Vrsta {
	
	private String rod;
	private String porodica;
	private String podvrsta;
	public Vrsta(String rod, String porodica, String podvrsta) {
		super();
		this.rod = rod;
		this.porodica = porodica;
		this.podvrsta = podvrsta;
	}
	public String getRod() {
		return rod;
	}
	public void setRod(String rod) {
		this.rod = rod;
	}
	public String getPorodica() {
		return porodica;
	}
	public void setPorodica(String porodica) {
		this.porodica = porodica;
	}
	public String getPodvrsta() {
		return podvrsta;
	}
	public void setPodvrsta(String podvrsta) {
		this.podvrsta = podvrsta;
	}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("rod = ");
		sb.append(rod);
		sb.append("porodica = ");
		sb.append(porodica);
		sb.append("podvrsta = ");
		sb.append(podvrsta);
		
		return "Vrsta [rod =" + rod + ", porodica=" + porodica + ", podvrsta=" + podvrsta + "]";
	}
	
	
	
	
	
	
	
	

}
