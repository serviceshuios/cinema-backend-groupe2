package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.ICategorieDao;
import com.montparnasse.cinema.domaine.Categorie;

/**
 * Classe CategorieServiceImpl de la couche service
 * implemente l'interface ICategorieService
 * @author IN-MP-019
 *
 */
@Service
public class CategorieServiceImpl implements ICategorieService{
	
	//recup de la dao
	@Autowired
	private ICategorieDao categorieDao;

	@Override
	public Categorie ajouter(Categorie c) {
		categorieDao.save(c);
		return c;
	}//end ajouter

	@Override
	public Categorie recuperer(Long idCategorie) {
		return categorieDao.findById(idCategorie).get();
	}//end recuperer

	@Override
	public Categorie modifier(Categorie c) {
		categorieDao.save(c);
		return c;
	}//end modifier

	@Override
	public boolean supprimer(Long idCategorie) {
		categorieDao.deleteById(idCategorie);
		return true;
	}//end supprimer

	@Override
	public List<Categorie> recupererTout() {
		return categorieDao.findAll();
	}//end recupererTout

}//end class
