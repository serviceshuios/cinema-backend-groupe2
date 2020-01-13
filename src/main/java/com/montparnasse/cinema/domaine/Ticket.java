package com.montparnasse.cinema.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//classe ticket de domaine
@Entity
public class Ticket {
	
	//Les variables
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
	

	//Les gets/sets

	public double getIdTicket() {
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

	
}//end classe ticket de domaine