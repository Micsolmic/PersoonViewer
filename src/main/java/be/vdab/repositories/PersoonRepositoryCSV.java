package be.vdab.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.Persoon;

public class PersoonRepositoryCSV implements PersoonRepository{
	private File file;
	
	public PersoonRepositoryCSV(String file) {
		this.file = new File(file);
	}
	
	public List<Persoon> findAll(){
		List<Persoon> personen = new ArrayList<>();
		try(Scanner xmlScanner = new Scanner(file)){
			  String text;   
			  while (xmlScanner.hasNext()) {
				  text = xmlScanner.nextLine();
				  try(Scanner regelScanner = new Scanner(text)){
					  
					  	int persoonNr;
						String voornaam;
						String familienaam;
						int aantalKinderen;
					  
						
						  
						 regelScanner.useDelimiter(",");	
						 while(regelScanner.hasNext()) {
							 
							 persoonNr = Integer.valueOf(regelScanner.next());
							 voornaam = regelScanner.next();
							 familienaam = regelScanner.next();
							 aantalKinderen = Integer.valueOf(regelScanner.next());
							 							 			 
							 Persoon persoon = new Persoon(persoonNr,voornaam,familienaam,aantalKinderen);
							 personen.add(persoon);
							 
						 }
						 
						 
						 
				  }catch(Exception ex) {/* end of line reached */}
			  
			  }   
			  }catch(Exception ex) {ex.printStackTrace(); return null;}
			
			return personen;
		}
		
		
	
}
