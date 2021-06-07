package dogadjaj;

public class Event {
	
	private String vreme;
	private Dvorana dvorana;
	private String tip;
	
	public Event(String vreme, Dvorana dvorana, String tip) {
		super();
		this.vreme = vreme;
		this.dvorana = dvorana;
		this.tip = tip;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}

	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	

}
