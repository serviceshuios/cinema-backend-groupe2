package com.montparnasse.cinema.domaine;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//classe Seance de domaine
@Entity
public class Seance {
	
	//Les variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSeance")
	private long idSeance;
	
	@Column(name = "heureDebut")
	private Date heureDebut;

	
	//Les gets/sets
	
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


}
