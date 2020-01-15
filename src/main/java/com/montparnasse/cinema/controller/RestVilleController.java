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

import com.montparnasse.cinema.domaine.Ville;
import com.montparnasse.cinema.service.IVilleService;

@CrossOrigin("*")
@RestController
public class RestVilleController {

	@Autowired
	private IVilleService service;

	// ======= Liste des villes ========= //

	@RequestMapping(value = "/villes", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Ville> recupererTout() {
		List<Ville> listeVilles = service.recupererTout();
		return listeVilles;
	}

	// ====== Recupérer une ville ========== //

	@RequestMapping(value = "/villes/{idVille}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Ville recuperer(@PathVariable("idVille") Long id) {
		Ville ville = service.recuperer(id);
		return ville;
	}

	// ====== Ajouter une ville ========== //

	@RequestMapping(value = "/villes", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Ville ajouter(@RequestBody Ville v) {
		return service.ajouter(v);
	}//end ajouter

	// ====== Modifier une ville ========== //

	@RequestMapping(value = "/villes", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Ville modifier(@RequestBody Ville v) {

		return service.modifier(v);

	}

	// ====== Supprimer une ville ========== //

	@RequestMapping(value = "/villes/{idVille}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public boolean supprimer(@PathVariable("idVille") Long id) {

		return service.supprimer(id);

	}

}
