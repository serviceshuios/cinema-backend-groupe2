package com.montparnasse.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.Cinema;

@Transactional
@Repository
public interface ICinemaDao extends JpaRepository<Cinema, Long> {
	
	// methode permettant de selectionner les cinemas correspondant à une ville donnée
	public List<Cinema> findByVilleId(Long idVille);

}
