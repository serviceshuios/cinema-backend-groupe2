package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.IFilmSalleDao;
import com.montparnasse.cinema.domaine.FilmSalle;
import com.montparnasse.cinema.domaine.FilmSalleId;



/**
 * Classe FilmSalleServiceImpl de la couche service
 * implemente l'interface IFilmSalleService
 * @author IN-MP-019
 *
 */
@Service
public class FilmSalleServiceImpl implements IFilmSalleService {
	
	//recup de la dao
	@Autowired
	private IFilmSalleDao filmSalleDao;

	@Override
	public FilmSalle ajouter(FilmSalle fs) {
		filmSalleDao.save(fs);
		return fs;
	}//end ajouter

	@Override
	public FilmSalle recuperer(FilmSalleId fsId) {
		return filmSalleDao.findById(fsId).get();
	}//end recuperer

	@Override
	public List<FilmSalle> recupererTout() {
		return filmSalleDao.findAll();
	}//end recupererTout

	@Override
	public FilmSalle modifier(FilmSalle fs) {
		filmSalleDao.save(fs);
		return fs;
	}//end modifier

	@Override
	public boolean supprimer(FilmSalleId fsId) {
		filmSalleDao.deleteById(fsId);
		return true;
	}//end supprimer


}//end class
