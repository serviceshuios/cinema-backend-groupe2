package com.montparnasse.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.Cinema;
import com.montparnasse.cinema.domaine.Place;

/**
 * interface IPlaceDao de la couche dao
 * @author IN-MP-019
 *
 */
@Transactional
@Repository
public interface IPlaceDao extends JpaRepository<Place, Long>{
	
	// methode permettant de selectionner les places correspondant à une salle donnée
	public List<Place> findBySalleId(Long idSalle);


}//end interface
