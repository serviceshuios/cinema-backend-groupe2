package com.montparnasse.cinema.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montparnasse.cinema.domaine.Salle;

@Transactional
@Repository
public interface ISalleDao extends JpaRepository<Salle, Long>{

}
