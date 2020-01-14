package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/***
 * Classe Salle de la couche domaine
 * @author IN-MP-019
 *
 */
@Entity
public class Salle implements Serializable {
	
	//============ Proprietés =========== //
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int nombrePlaces;
	
	/*================= */
	/*   Associations   */
	/*================= */
	@JsonIgnore
	@OneToMany(mappedBy = "salle")
	private List<Place> places = new ArrayList<Place>();
	
	@OneToOne
	private Cinema cinema;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id.salle")
	private List<FilmSalle> filmSalles = new ArrayList<FilmSalle>();
	
	
	//============ Getters/Setters =========== //
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNombrePlaces() {
		return nombrePlaces;
	}
	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}
	
	

}//end class
