package com.montparnasse.cinema.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montparnasse.cinema.domaine.Categorie;

/**
 * interface ICategorieDao de la couche dao
 * @author IN-MP-019
 *
 */
@Transactional
@Repository
public interface ICategorieDao extends JpaRepository<Categorie, Long> {

}//end interface
