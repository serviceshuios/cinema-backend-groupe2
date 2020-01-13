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

import com.montparnasse.cinema.domaine.Film;
import com.montparnasse.cinema.service.IFilmService;

/**
 * Classe Controller RestFilmController de la couche controller
 * @author IN-MP-019
 *
 */
//faire le lien avec projet Angular
@CrossOrigin("*") 
@RestController
public class RestFilmController {
	
	//recup du service
	@Autowired
	private IFilmService filmService;
	
	//lister ts les films
	@RequestMapping(value = "/films", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Film> getFilms() {
		List<Film> list = filmService.recupererTout();
		return list;
	}//end getFilms
	
	//lister un film
	@RequestMapping(value = "/films/{idFilmA}", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Film getFilm(@PathVariable("idFilmA") Long idFilm) {
		return filmService.recuperer(idFilm);
	}//end getFilm
	
	//ajouter un film
	@RequestMapping(value = "/films", //
					method = RequestMethod.POST, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Film addFilm(@RequestBody Film film) {
		return filmService.ajouter(film);
	}//end addFilm
	
	//modifier un film
	@RequestMapping(value = "/films", //
					method = RequestMethod.PUT, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Film updateFilm(@RequestBody Film film) {
		return filmService.modifier(film);
	}//end updateFilm
	
	//supprimer un film
	@RequestMapping(value = "/films/{idFilmA}", //
					method = RequestMethod.DELETE, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteFilm(@PathVariable("idFilmA") Long idFilm) {
		return filmService.supprimer(idFilm);
	}//end deleteFilm

}//end class
