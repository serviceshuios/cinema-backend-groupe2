package com.montparnasse.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montparnasse.cinema.domaine.FilmSalle;
import com.montparnasse.cinema.domaine.FilmSalleId;
import com.montparnasse.cinema.service.IFilmSalleService;
import com.montparnasse.cinema.service.IFilmService;
import com.montparnasse.cinema.service.ISalleService;

/**
 * Classe Controller RestFilmSalleController de la couche controller
 * @author IN-MP-019
 *
 */
//faire le lien avec projet Angular
@CrossOrigin("*") 
@RestController
public class RestFilmSalleController {
	
	@Autowired
	private IFilmSalleService service;
	
	@Autowired
	private IFilmService filmService;
	
	@Autowired 
	private ISalleService salleService;
	
	//lister ttes les filmSalles
	@RequestMapping(value = "/filmSalles", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<FilmSalle> getFilmSalles() {
		List<FilmSalle> list = service.recupererTout();
		return list;
	}//end getFilmSalles
	
	//lister une filmSalle
	@RequestMapping(value = "/filmSalles/{idFilmA}/{idSalleA}", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public FilmSalle getFilmSalle(@PathVariable("idFilmA") Long idFilm, 
								  @PathVariable("idSalleA") Long idSalle) {
		FilmSalleId fsId = new FilmSalleId();
		fsId.setFilm(filmService.recuperer(idFilm));   
		fsId.setSalle(salleService.recuperer(idSalle));
		return service.recuperer(fsId);
	}//end getFilmSalle
	
	//ajouter une filmSalle ==> pas maj mais creation d'une nouvelle ligne dans la 3eme table de jointure
	@RequestMapping(value = "/filmSalles/{idFilmA}/{idSalleA}", //
					method = RequestMethod.POST, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public FilmSalle addFilmSalle(@PathVariable("idFilmA") Long idFilm, 
										 @PathVariable("idSalleA") Long idSalle) {
		//creation de la clé composée
		FilmSalleId fsId = new FilmSalleId();
		fsId.setFilm(filmService.recuperer(idFilm));   
		fsId.setSalle(salleService.recuperer(idSalle));
		//creation de la FilmSalle en utilisant cette clé
		FilmSalle fs = new FilmSalle();
		fs.setId(fsId);
		//ajout de la FilmSalle
		return service.ajouter(fs);
	}//end addFilmSalle
	
	//modifier une filmSalle
	@RequestMapping(value = "/filmSalles/{idFilmA}/{idSalleA}/{idFilmB}/{idSalleB}", //
					method = RequestMethod.PUT, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public FilmSalle updateFilmSalle(@PathVariable("idFilmA") Long idFilm1, 
											@PathVariable("idSalleA") Long idSalle1,
											@PathVariable("idFilmB") Long idFilm2,
											@PathVariable("idSalleB") Long idSalle2) {
		//recup de FilmSalle concernée
		FilmSalleId fsId1 = new FilmSalleId();
		fsId1.setFilm(filmService.recuperer(idFilm1)); 
		fsId1.setSalle(salleService.recuperer(idSalle1));
		FilmSalle fs = service.recuperer(fsId1);
		service.supprimer(fsId1);
		//modif de l'id
		fsId1.setFilm(filmService.recuperer(idFilm2));
		fsId1.setSalle(salleService.recuperer(idSalle2));
		//ajout de la clé avec les modifs à la filiereformation existante récupérée
		fs.setId(fsId1);
		service.ajouter(fs);
		return fs;
	}//end updateFilmSalle
	
	//supprimer une filmSalle
	@RequestMapping(value = "/filmSalles/{idFilmA}/{idSalleA}", //
					method = RequestMethod.DELETE, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteFilmSalle(@PathVariable("idFilmA") Long idFilm, 
								   @PathVariable("idSalleA") Long idSalle) {
		//creation de la clé composée
		FilmSalleId fsId = new FilmSalleId();
		fsId.setFilm(filmService.recuperer(idFilm));   
		fsId.setSalle(salleService.recuperer(idSalle));
		return service.supprimer(fsId);
	}//end deleteFilmSalle

}//end class
