package com.montparnasse.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montparnasse.cinema.domaine.Cinema;
import com.montparnasse.cinema.domaine.ProjectionFilm;
import com.montparnasse.cinema.service.IProjectionFilmService;


/**
 * Classe Controller RestFilmController.java de la couche controller
 * @author IN-MP-019
 *
 */
// faire le lien avec projet Angular
@CrossOrigin("*") 
@RestController
public class RestProjectionFilmController {
	
	//recup du service
	@Autowired
	private IProjectionFilmService projectionFilmService;
	
	//lister ttes les projections films
	@RequestMapping(value = "/projectionFilms", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<ProjectionFilm> getProjectionFilms() {
		List<ProjectionFilm> list = projectionFilmService.recupererTout();
		return list;
	}//end getProjectionFilms
	
	//lister une projection film
	@RequestMapping(value = "/projectionFilms/{idProjectionFilmA}", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ProjectionFilm getProjectionFilm(@PathVariable("idProjectionFilmA") Long idProjectionFilm) {
		return projectionFilmService.recuperer(idProjectionFilm);
	}//end getProjectionFilm
	
	//ajouter une projection film
	@RequestMapping(value = "/projectionFilms", //
					method = RequestMethod.POST, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ProjectionFilm addProjectionFilm(@RequestBody ProjectionFilm projectionFilm) {
		return projectionFilmService.ajouter(projectionFilm);
	}//end addProjectionFilm
	
	//modifier une projection film
	@RequestMapping(value = "/projectionFilms", //
					method = RequestMethod.PUT, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ProjectionFilm updateProjectionFilm(@RequestBody ProjectionFilm projectionFilm) {
		return projectionFilmService.modifier(projectionFilm);
	}//end updateProjectionFilm
	
	//supprimer une projection film
	@RequestMapping(value = "/projectionFilms/{idProjectionFilmA}", //
					method = RequestMethod.DELETE, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteProjectionFilm(@PathVariable("idProjectionFilmA") Long idProjectionFilm) {
		return projectionFilmService.supprimer(idProjectionFilm);
	}//end deleteProjectionFilm
	
	// ====== Liste des projections pour une salle donnée ========== //
	@RequestMapping(value = "/projectionFilms/salles/{idSalleA}", 
					method = RequestMethod.GET, 
					produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<ProjectionFilm> recupererProjectionDeSalle(@PathVariable("idSalleA") Long idSalle) {
		List<ProjectionFilm> listeProjections = projectionFilmService.rechercherParSalle(idSalle);
		return listeProjections;
	}

}//end class
