package com.montparnasse.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.Place;

/**
 * interface IPlaceDao de la couche dao
 * @author IN-MP-019
 *
 */
@Transactional
@Repository
public interface IPlaceDao extends JpaRepository<Place, Long>{

}//end interface
