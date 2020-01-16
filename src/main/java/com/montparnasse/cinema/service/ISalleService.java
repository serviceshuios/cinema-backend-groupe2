package com.montparnasse.cinema.service;

import java.util.List;

import com.montparnasse.cinema.domaine.Salle;

public interface ISalleService extends IGeneriqueService<Salle> {
	
	public List<Salle> rechercherParCinema(Long idCinema);
	
}//end interface
