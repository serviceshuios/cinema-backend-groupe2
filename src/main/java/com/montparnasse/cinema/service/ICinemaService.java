package com.montparnasse.cinema.service;

import java.util.List;

import com.montparnasse.cinema.domaine.Cinema;

public interface ICinemaService extends IGeneriqueService<Cinema> {
	
	// methode permettant de selectionner les cinemas correspondant à une ville donnée
	public List<Cinema> rechercherParVille(Long idVille);

}//end interface
