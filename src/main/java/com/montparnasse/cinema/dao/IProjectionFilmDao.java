package com.montparnasse.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.ProjectionFilm;

/**
 * interface IProjectionFilmDao de la couche dao
 * @author IN-MP-019
 *
 */
@Transactional
@Repository
public interface IProjectionFilmDao extends JpaRepository<ProjectionFilm, Long> {

}//end interface
