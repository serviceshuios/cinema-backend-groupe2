package com.montparnasse.cinema.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//classe Place de domaine
@Entity
public class Place {
	
	//Les variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPlace")
	private long idPlace;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = " longitude")
	private double longitude;
	
	@Column(name = " latitude")
	private double latitude;
	
	@Column(name = " altitude")
	private double altitude;
	
	
	//Les gets/sets

	public long getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(long idPlace) {
		this.idPlace = idPlace;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}


}
