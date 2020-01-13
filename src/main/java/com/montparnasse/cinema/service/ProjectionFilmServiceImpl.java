package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.IProjectionFilmDao;
import com.montparnasse.cinema.domaine.ProjectionFilm;


/**
 * Classe ProjectionFilmServiceImpl de la couche service
 * implemente l'interface IProjectionFilmService
 * @author IN-MP-019
 *
 */
@Service
public class ProjectionFilmServiceImpl implements IProjectionFilmService{
	
	//recup de la dao
	@Autowired
	private IProjectionFilmDao projectionFilmDao;

	@Override
	public ProjectionFilm ajouter(ProjectionFilm pf) {
		projectionFilmDao.save(pf);
		return pf;
	}//end ajouter

	@Override
	public ProjectionFilm recuperer(Long idProjectionFilm) {
		return projectionFilmDao.findById(idProjectionFilm).get();
	}//end recuperer

	@Override
	public ProjectionFilm modifier(ProjectionFilm pf) {
		projectionFilmDao.save(pf);
		return pf;
	}//end modifier

	@Override
	public boolean supprimer(Long idProjectionFilm) {
		projectionFilmDao.deleteById(idProjectionFilm);
		return true;
	}//end supprimer

	@Override
	public List<ProjectionFilm> recupererTout() {
		return projectionFilmDao.findAll();
	}//end recupererTout
}//end class
