package com.montparnasse.cinema.service;

import java.util.List;

import com.montparnasse.cinema.domaine.ProjectionFilm;

/**
 * interface IProjectionFilmService de la couche service
 * hérite de l'interface générique IGeneriqueService
 * @author IN-MP-019
 *
 */
public interface IProjectionFilmService extends IGeneriqueService<ProjectionFilm>{
	
	// methode permettant de selectionner les projections correspondant à une salle donnée
	public List<ProjectionFilm> rechercherParSalle(Long idSalle);

}//end interface
