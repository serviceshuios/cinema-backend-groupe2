package com.montparnasse.cinema.service;

import java.util.List;

import com.montparnasse.cinema.domaine.Place;

/**
 * interface IPlaceService de la couche service
 * hérite de l'interface générique IGeneriqueService
 * @author IN-MP-019
 *
 */
public interface IPlaceService extends IGeneriqueService<Place>{
	
	// methode permettant de selectionner les places correspondant à une salle donnée
	public List<Place> rechercherParSalle(Long idSalle);

}//end interface
