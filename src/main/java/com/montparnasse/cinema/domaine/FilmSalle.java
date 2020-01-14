package com.montparnasse.cinema.domaine;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Classe FilmSalle de la couche domaine
 * issue de l'association @ManyToMany de Film et Salle
 * @author IN-MP-019
 *
 */
@Entity
public class FilmSalle implements Serializable{
	
	/*________________________________ props _________________________________*/
	@EmbeddedId
	private FilmSalleId id;
	
	/*________________________________ getters / setters _________________________________*/

	public FilmSalleId getId() {
		return id;
	}

	public void setId(FilmSalleId id) {
		this.id = id;
	}


}//end class
