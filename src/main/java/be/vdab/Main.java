package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.repositories.PersoonRepositoryMeerdereRegels;

public class Main {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml")){
			PersoonViewer pv = (PersoonViewer) context.getBean("persoonViewer");
			System.out.println(pv.getPersoonService().findAll());
		}

	}

}
