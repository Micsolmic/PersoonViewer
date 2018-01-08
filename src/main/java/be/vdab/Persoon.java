package be.vdab;

public class Persoon {

	private int persoonNr;
	private String voornaam;
	private String familienaam;
	private int aantalKinderen;
	
	
	
	
	
	public Persoon(int persoonNr, String voornaam, String familienaam, int aantalKinderen) {
		super();
		this.persoonNr = persoonNr;
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.aantalKinderen = aantalKinderen;
	}
	public int getPersoonNr() {
		return persoonNr;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public String getFamilienaam() {
		return familienaam;
	}
	public int getAantalKinderen() {
		return aantalKinderen;
	}
	public void setPersoonNr(int persoonNr) {
		this.persoonNr = persoonNr;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}
	public void setAantalKinderen(int aantalKinderen) {
		this.aantalKinderen = aantalKinderen;
	}
	
	public void toonAttr() {
		
		System.out.println(getPersoonNr());
		System.out.println(getVoornaam());
		System.out.println(getFamilienaam());
		
			System.out.println(getAantalKinderen());			
		
	
		System.out.println("-----------------------------------------");
		
	}
	
}
