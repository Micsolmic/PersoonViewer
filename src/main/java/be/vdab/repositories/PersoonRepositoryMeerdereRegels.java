package be.vdab.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.Persoon;

public class PersoonRepositoryMeerdereRegels {

	private File file;
	
	
	
	public PersoonRepositoryMeerdereRegels(File file) {
		this.file = file;
	}
	
	public List<Persoon> findAll(){
		List<Persoon> personen = new ArrayList<>();
		try(Scanner xmlScanner = new Scanner(file)){
			     
			  while (xmlScanner.hasNextLine()) {
				  	int persoonNr = Integer.valueOf(xmlScanner.nextLine());
					String voornaam = xmlScanner.nextLine();
					String familienaam = xmlScanner.nextLine();
					int aantalKinderen = Integer.valueOf(xmlScanner.nextLine());
					Persoon persoon = new Persoon(persoonNr, voornaam, familienaam, aantalKinderen);
					personen.add(persoon);
			  }   
			  }catch(Exception ex) {ex.printStackTrace(); return null;}
			
			return personen;
		}
		
		
	
}
