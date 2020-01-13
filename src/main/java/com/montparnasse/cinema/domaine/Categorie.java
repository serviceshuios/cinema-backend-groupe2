package com.montparnasse.cinema.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Categorie de la couche domaine
 * @author IN-MP-019
 *
 */
@Entity
public class Categorie implements Serializable{
	
	/*__________________________________ Props ____________________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	private String name;
	
	/*__________________________________ getters / setters ____________________________________*/
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}//end class
