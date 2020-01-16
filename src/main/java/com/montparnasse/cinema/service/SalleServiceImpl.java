package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.ISalleDao;
import com.montparnasse.cinema.domaine.Salle;

@Service
public class SalleServiceImpl implements ISalleService{
	
	@Autowired
	private ISalleDao idao;

	@Override
	public Salle ajouter(Salle s) {
		return idao.save(s);
	}

	

	@Override
	public Salle modifier(Salle s) {
		
		return idao.save(s);
	}

	@Override
	public boolean supprimer(Long id) {
		idao.deleteById(id);
		return true;
	}

	@Override
	public Salle recuperer(Long id) {
		return idao.findById(id).get();
	}

	@Override
	public List<Salle> recupererTout() {
		return idao.findAll();
	}



	@Override
	public List<Salle> rechercherParCinema(Long idCinema) {
		return idao.findByCinemaId(idCinema);
	}

}//end class
