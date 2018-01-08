package be.vdab;

import java.util.List;

public class PersoonViewer {

	PersoonEigenschap[] eigenschappen;
	
	public PersoonViewer(PersoonEigenschap[] eigenschappen) {		
		this.eigenschappen = eigenschappen;		
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
