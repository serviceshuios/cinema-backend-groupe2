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
		// TODO Auto-generated method stub
		return idao.save(s);
	}

	

	@Override
	public Salle modifier(Salle s) {
		// TODO Auto-generated method stub
		return idao.save(s);
	}

	@Override
	public boolean supprimer(Salle s) {
		idao.delete(s);
		return true;
	}

	@Override
	public Salle recuperer(Long id) {
		// TODO Auto-generated method stub
		return idao.findById(id).get();
	}

	@Override
	public List<Salle> recupererTout() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

}
