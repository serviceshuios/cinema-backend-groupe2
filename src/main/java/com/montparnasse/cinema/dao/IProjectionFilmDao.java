package com.montparnasse.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.ProjectionFilm;
import com.montparnasse.cinema.domaine.Salle;

/**
 * interface IProjectionFilmDao de la couche dao
 * @author IN-MP-019
 *
 */
@Transactional
@Repository
public interface IProjectionFilmDao extends JpaRepository<ProjectionFilm, Long> {
	
	// methode permettant de selectionner les projections correspondant à une salle donnée
	public List<ProjectionFilm> findBySalleId(Long idSalle);

}//end interface
