package com.montparnasse.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.FilmSalle;
import com.montparnasse.cinema.domaine.FilmSalleId;

/**
 * interface IFilmSalleDao de la couche dao
 * @author IN-MP-019
 *
 */
@Transactional
@Repository
public interface IFilmSalleDao extends JpaRepository<FilmSalle, FilmSalleId> {

}//end interface
