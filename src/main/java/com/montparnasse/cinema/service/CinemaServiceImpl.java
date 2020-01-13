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
		// TODO Auto-generated method stub
		return idao.save(c);
	}

	@Override
	public Cinema recuperer(Long id) {
		// TODO Auto-generated method stub
		return idao.findById(id).get();
	}

	@Override
	public Cinema modifier(Long id) {
		Cinema cinemaModif = idao.findById(id).get();
		return idao.save(cinemaModif);
	}

	@Override
	public boolean supprimer(Cinema c) {
		idao.delete(c);
		return true;
	}

	@Override
	public List<Cinema> recupererTout() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

}
