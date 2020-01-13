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
		// TODO Auto-generated method stub
		return idao.findAll();
	}

}
