package be.vdab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml")){
			PersoonViewer pv = (PersoonViewer) context.getBean("persoonViewer");
			List<Persoon> lijst = new ArrayList<>();
			Persoon per1 = new Persoon(1, "Jack", "Black", 0);
			Persoon per2 = new Persoon(2, "Sergey", "Bodrov", 3);
			Persoon per3 = new Persoon(3,"Piotr","Mamonov", 7);
			lijst.add(per1);
			lijst.add(per2);
			lijst.add(per3);
			pv.afbeelden(lijst);
		}

	}

}
