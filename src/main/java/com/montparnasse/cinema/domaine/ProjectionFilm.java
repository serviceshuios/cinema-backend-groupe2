package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe ProjectionFilm de la couche domaine
 * @author IN-MP-019
 *
 */
//@Table(name = "ProjectionFilm", //
//uniqueConstraints = { 
//        @UniqueConstraint(name = "ProjectionFilm_UK", columnNames = { "Film_Id", "Salle_Id" }) })
@Entity
public class ProjectionFilm implements Serializable{
	
	/*__________________________________ Props ____________________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long idProjectionFilm;
	private Date dateProjection;
	private double prix;
	
	/*================= */
	/*   Associations   */
	/*================= */
	@OneToOne
	private Seance seance;
	
	@JsonIgnore
	@OneToMany(mappedBy = "projectionFilm")
	private List<Ticket> tickets = new ArrayList<Ticket>();
	
	@ManyToOne
    @JoinColumn(name = "Film_Id")
    private Film film;
 
	@ManyToOne
    @JoinColumn(name = "Salle_Id")
    private Salle salle;
 
	
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
	public Seance getSeance() {
		return seance;
	}
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
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
	
	
}//end class
