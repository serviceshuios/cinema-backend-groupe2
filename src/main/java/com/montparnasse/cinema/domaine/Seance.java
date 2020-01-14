package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Seance de la couche domaine
 * @author IN-MP-019
 *
 */
@Entity
public class Seance implements Serializable{
	
	/*__________________________________ Props ____________________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSeance")
	private long idSeance;
	
	@Column(name = "heureDebut")
	private Date heureDebut;

	
	/*__________________________________ getters / setters ____________________________________*/
	
	public long getIdSeance() {
		return idSeance;
	}

	public void setIdSeance(long idSeance) {
		this.idSeance = idSeance;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}


}//end class
