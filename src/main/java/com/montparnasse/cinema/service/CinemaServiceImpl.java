package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.ICinemaDao;
import com.montparnasse.cinema.domaine.Cinema;

@Service
public class CinemaServiceImpl implements ICinemaService{

	@Autowired
	private ICinemaDao idao;
	
	@Override
	public Cinema ajouter(Cinema c) {
		return idao.save(c);
	}

	@Override
	public Cinema recuperer(Long id) {
		return idao.findById(id).get();
	}

	@Override
	public Cinema modifier(Cinema c) {
		
		return idao.save(c);
	}

	@Override
	public boolean supprimer(Long id) {
		idao.deleteById(id);
		return true;
	}

	@Override
	public List<Cinema> recupererTout() {
		return idao.findAll();
	}

	@Override
	public List<Cinema> rechercherParVille(Long idVille) {
		return idao.findByVilleId(idVille);
	}//end rechercherParVille

}// end class
