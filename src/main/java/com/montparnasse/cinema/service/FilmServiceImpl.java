package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.IFilmDao;
import com.montparnasse.cinema.domaine.Film;


/**
 * Classe FilmServiceImpl de la couche service
 * implemente l'interface IFilmService
 * @author IN-MP-019
 *
 */
@Service
public class FilmServiceImpl implements IFilmService {
	
	//recup de la dao
	@Autowired
	private IFilmDao filmDao;

	@Override
	public Film ajouter(Film f) {
		filmDao.save(f);
		return f;
	}//end ajouter

	@Override
	public Film recuperer(Long idFilm) {
		return filmDao.findById(idFilm).get();
	}//end recuperer

	@Override
	public Film modifier(Film f) {
		filmDao.save(f);
		return f;
	}//end modifier

	@Override
	public boolean supprimer(Long idFilm) {
		filmDao.deleteById(idFilm);
		return true;
	}//end supprimer

	@Override
	public List<Film> recupererTout() {
		return filmDao.findAll();
	}//end recupererTout

}//end class
