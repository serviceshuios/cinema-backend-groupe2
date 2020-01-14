package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe Film de la couche domaine
 * @author IN-MP-019
 *
 */
@Entity
public class Film implements Serializable{
	
	/*__________________________________ Props ____________________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFilm;
	private String titre;
	private double duree;
	private String realisateur;
	private String description;
	private String photo;
	private Date dateSortie;
	
	/*================= */
	/*   Associations   */
	/*================= */
	@OneToOne
	private Categorie categorie;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id.film")
	private List<FilmSalle> filmSalles = new ArrayList<FilmSalle>();
	
	/*__________________________________ getters / setters ____________________________________*/
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public List<FilmSalle> getFilmSalles() {
		return filmSalles;
	}
	public void setFilmSalles(List<FilmSalle> filmSalles) {
		this.filmSalles = filmSalles;
	}
	
		
}//end class
