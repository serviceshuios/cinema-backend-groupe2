package com.montparnasse.cinema.service;

import java.util.List;

import com.montparnasse.cinema.domaine.FilmSalle;
import com.montparnasse.cinema.domaine.FilmSalleId;

/**
 * interface IFilmSalleService de la couche service
 * @author IN-MP-019
 *
 */
public interface IFilmSalleService {

	public FilmSalle ajouter(FilmSalle filmSalle);
	public FilmSalle recuperer(FilmSalleId id);
	public FilmSalle modifier(FilmSalle filmSalle);
	public boolean supprimer(FilmSalleId id);
	public List<FilmSalle> recupererTout();
	
}//end interface
