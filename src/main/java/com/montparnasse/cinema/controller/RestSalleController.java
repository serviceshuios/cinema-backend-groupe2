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

import com.montparnasse.cinema.domaine.Salle;
import com.montparnasse.cinema.service.ISalleService;


@CrossOrigin("*")
@RestController
public class RestSalleController {

	@Autowired
	private ISalleService service;

	// ======= Liste des salles ========= //

	@RequestMapping(value = "/salles", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Salle> recupererTout() {
		List<Salle> listeSalles = service.recupererTout();
		return listeSalles;
	}

	// ====== Recupérer une salle ========== //

	@RequestMapping(value = "/salles/{idSalle}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Salle recuperer(@PathVariable("idSalle") Long id) {
		Salle salle = service.recuperer(id);
		return salle;
	}

	// ====== Ajouter une salle ========== //

	@RequestMapping(value = "/salles", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Salle ajouter(@RequestBody Salle s) {
		return service.ajouter(s);
	}//end ajouter

	// ====== Modifier une salle ========== //

	@RequestMapping(value = "/salles", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Salle modifier(@RequestBody Salle s) {

		return service.modifier(s);

	}

	// ====== Supprimer une salle ========== //

	@RequestMapping(value = "/salles/{idSalle}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public boolean supprimer(@PathVariable("idSalle") Long id) {

		return service.supprimer(id);

	}
}
