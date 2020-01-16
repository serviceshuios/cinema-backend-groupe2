package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	@Column(name = "Salle_Id", nullable = false)
	private Long id;
	private String name;
	private int nombrePlaces;
	
	/*================= */
	/*   Associations   */
	/*================= */
	@JsonIgnore
	@OneToMany(mappedBy = "salle")
	private List<Place> places = new ArrayList<Place>();
	
	@ManyToOne
	private Cinema cinema;	
	
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
	public List<Place> getPlaces() {
		return places;
	}
	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	
}//end class
