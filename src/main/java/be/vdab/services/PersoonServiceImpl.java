package be.vdab.services;

import java.util.List;

import be.vdab.Persoon;
import be.vdab.repositories.PersoonRepository;

public class PersoonServiceImpl implements PersoonService {

	private PersoonRepository repo;
	
	public PersoonServiceImpl(PersoonRepository repo) {
		this.repo = repo;
	}
	
	public List<Persoon> findAll(){
		return repo.findAll();
	}
	
}
