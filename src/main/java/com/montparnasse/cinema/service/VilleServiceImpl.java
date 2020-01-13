package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.IVilleDao;
import com.montparnasse.cinema.domaine.Ville;

@Service
public class VilleServiceImpl implements IVilleService{
	
	@Autowired
	IVilleDao idao;

	@Override
	public Ville ajouter(Ville v) {
		// TODO Auto-generated method stub
		return idao.save(v);
	}

	@Override
	public Ville recuperer(Long id) {
		// TODO Auto-generated method stub
		return idao.findById(id).get();
	}

	@Override
	public Ville modifier(Ville v) {
		
		return idao.save(v);
	}

	@Override
	public boolean supprimer(Long id) {
		idao.deleteById(id);
		return true;
	}

	@Override
	public List<Ville> recupererTout() {
		// TODO Auto-generated method stub
		return null;
	}

}
