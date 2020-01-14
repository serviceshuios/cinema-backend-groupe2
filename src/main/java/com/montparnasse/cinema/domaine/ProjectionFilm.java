package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe ProjectionFilm de la couche domaine
 * @author IN-MP-019
 *
 */
@Entity
public class ProjectionFilm implements Serializable{
	
	/*__________________________________ Props ____________________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProjectionFilm;
	private Date dateProjection;
	private double prix;
	
	private FilmSalle filmSalle;
	
	/*================= */
	/*   Associations   */
	/*================= */
	@OneToOne
	private Seance seance;
	
	@JsonIgnore
	@OneToMany(mappedBy = "projectionFilm")
	private List<Ticket> tickets = new ArrayList<Ticket>();
	
	/*__________________________________ getters / setters ____________________________________*/
	public Long getIdProjectionFilm() {
		return idProjectionFilm;
	}
	public void setIdProjectionFilm(Long idProjectionFilm) {
		this.idProjectionFilm = idProjectionFilm;
	}
	public Date getDateProjection() {
		return dateProjection;
	}
	public void setDateProjection(Date dateProjection) {
		this.dateProjection = dateProjection;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}	
		
}//end class
