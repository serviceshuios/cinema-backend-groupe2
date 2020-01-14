package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	/*================= */
	/*   Associations   */
	/*================= */
	@JsonIgnore
	@OneToMany(mappedBy = "categorie")
	private List<Film> films = new ArrayList<Film>();
	
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
