package com.montparnasse.cinema.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe Ticket de la couche domaine
 * @author IN-MP-019
 *
 */
@Entity
public class Ticket implements Serializable{
	
	/*__________________________________ Props ____________________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTicket")
	private long idTicket;
	
	@Column(name = "nomClient")
	private String nomClient;
	
	@Column(name = "prix")
	private double prix;
	
	@Column(name = "codePayement")
	private int codePayement;
	
	@Column(name = "reservee")
	private boolean reservee;
	
	/*================= */
	/*   Associations   */
	/*================= */
	@OneToOne
	private ProjectionFilm projectionFilm;
	
	@OneToOne
	private Place place;

	/*__________________________________ getters / setters ____________________________________*/

	public long getIdTicket() {
		return idTicket;
	}

	
	public void setIdTicket(long idTicket) {
		this.idTicket = idTicket;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getCodePayement() {
		return codePayement;
	}

	public void setCodePayement(int codePayement) {
		this.codePayement = codePayement;
	}

	public boolean isReservee() {
		return reservee;
	}

	public void setReservee(boolean reservee) {
		this.reservee = reservee;
	}


	public ProjectionFilm getProjectionFilm() {
		return projectionFilm;
	}


	public void setProjectionFilm(ProjectionFilm projectionFilm) {
		this.projectionFilm = projectionFilm;
	}


	public Place getPlace() {
		return place;
	}


	public void setPlace(Place place) {
		this.place = place;
	}

	
}//end classe ticket de domaine
