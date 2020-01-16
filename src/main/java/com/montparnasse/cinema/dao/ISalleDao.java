package com.montparnasse.cinema.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montparnasse.cinema.domaine.Salle;

@Transactional
@Repository
public interface ISalleDao extends JpaRepository<Salle, Long>{
	
	// methode permettant de selectionner les salles correspondant à un cinema donnée
	public List<Salle> findByCinemaId(Long idCinema);

}//end interface
