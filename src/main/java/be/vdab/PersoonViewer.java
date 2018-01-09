package be.vdab;

import java.util.List;

import be.vdab.services.PersoonService;

public class PersoonViewer {

	PersoonEigenschap[] eigenschappen;
	PersoonService persoonService;
	
	public PersoonEigenschap[] getEigenschappen() {
		return eigenschappen;
	}

	public PersoonService getPersoonService() {
		return persoonService;
	}

	public void setEigenschappen(PersoonEigenschap[] eigenschappen) {
		this.eigenschappen = eigenschappen;
	}

	public void setPersoonService(PersoonService persoonService) {
		this.persoonService = persoonService;
	}

	
	
	
	
	
	
	public void afbeelden(List<Persoon> personen) {
		
		for(Persoon p: personen) {
			
			for(int i = 0; i<eigenschappen.length; i++) {
				
				switch(eigenschappen[i]) {
				
				case PERSOON_NR: 
					System.out.println(p.getPersoonNr());
					break;
				case VOORNAAM:
					System.out.println(p.getVoornaam());
					break;
				case FAMILIENAAM:
					System.out.println(p.getFamilienaam());
					break;
				case AANTAL_KINDEREN:
					System.out.println(p.getAantalKinderen());				
				}
				
			}
			System.out.println("---------------------------------");
		}
		
	}




	
}
