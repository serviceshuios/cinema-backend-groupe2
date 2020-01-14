package com.montparnasse.cinema.domaine;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe FilmSalleId de la couche domaine
 * issue de l'association @ManyToMany entre Film et Salle
 * Correspond à la clé composée
 * @author IN-MP-019
 *
 */
@Embeddable
public class FilmSalleId implements Serializable{
	
	/*________________________________ props _________________________________*/
	@ManyToOne
	@JoinColumn( name = "FilmId")
	private Film film;
	
	@ManyToOne
	@JoinColumn(name = "SalleId")
	private Salle salle;

	/*________________________________ getters / setters _________________________________*/
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	

}//end 
