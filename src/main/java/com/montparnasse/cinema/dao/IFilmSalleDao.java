package com.montparnasse.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.FilmSalle;

/**
 * interface IFilmSalleDao de la couche dao
 * @author IN-MP-019
 *
 */
@Transactional
@Repository
public interface IFilmSalleDao extends JpaRepository<FilmSalle, Long> {

}//end interface
