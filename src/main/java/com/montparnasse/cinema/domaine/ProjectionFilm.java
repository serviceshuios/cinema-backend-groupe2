package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
	
	/*================= */
	/*   Associations   */
	/*================= */
	@OneToOne
	private Seance seance;
	
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
