package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe Place de la couche domaine
 * @author IN-MP-019
 *
 */
@Entity
public class Place implements Serializable{
	
	/*__________________________________ Props ____________________________________*/
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
	
	/*================= */
	/*   Associations   */
	/*================= */
	@OneToOne
	private Salle salle;
	
	@JsonIgnore
	@OneToMany(mappedBy = "place")
	private List<Ticket> tickets = new ArrayList<Ticket>();
	
	/*__________________________________ getters / setters ____________________________________*/

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


}//end class
