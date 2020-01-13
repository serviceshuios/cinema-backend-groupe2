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
import com.montparnasse.cinema.service.ICinemaService;

@CrossOrigin("*")
@RestController
public class RestCinemaController {
	@Autowired
	private ICinemaService service;

	// ======= Liste des cinemas ========= //

	@RequestMapping(value = "/cinemas", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Cinema> recupererTout() {
		List<Cinema> listeCinemas = service.recupererTout();
		return listeCinemas;
	}

	// ====== Recupérer une cinema ========== //

	@RequestMapping(value = "/cinemas/{idCinema}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Cinema recuperer(@PathVariable("idCinema") Long id) {
		Cinema cinema = service.recuperer(id);
		return cinema;
	}

	// ====== Recupérer une cinema ========== //

	@RequestMapping(value = "/cinemas", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void ajouter(@RequestBody Cinema c) {
		service.ajouter(c);
	}

	// ====== Modifier une cinema ========== //

	@RequestMapping(value = "/cinemas", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Cinema modifier(@RequestBody Cinema c) {

		return service.modifier(c);

	}

	// ====== Supprimer un cinema ========== //

	@RequestMapping(value = "/cinemas/{idCinema}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public boolean supprimer(@PathVariable("idCinema") Long id) {

		return service.supprimer(id);

	}

}
