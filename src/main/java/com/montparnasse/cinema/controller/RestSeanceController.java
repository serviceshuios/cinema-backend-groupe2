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

import com.montparnasse.cinema.domaine.Seance;
import com.montparnasse.cinema.service.ISeanceService;

/**
* Classe Controller RestSeanceController de la couche controller
* @author IN-MP-019
*
*/
@CrossOrigin("*")
@RestController
public class RestSeanceController {
	
	//recup du service
	@Autowired
	private ISeanceService seanceService;
	
	//lister toutes les seances
	@RequestMapping(value = "/seances", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Seance> getSeances() {
		List<Seance> list = seanceService.recupererTout();
		return list;
	}//end getSeances
	
	//lister une seance
	@RequestMapping(value = "/seances/{idSeanceA}", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Seance getSeance(@PathVariable("idSeanceA") Long idSeance) {
		return seanceService.recuperer(idSeance);
	}//end getSeance
	
	//ajouter une seance
	@RequestMapping(value = "/seances", //
					method = RequestMethod.POST, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Seance addSeance(@RequestBody Seance seance) {
		return seanceService.ajouter(seance);
	}//end addSeance
	
	//modifier une seance
	@RequestMapping(value = "/seances", //
					method = RequestMethod.PUT, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Seance updateSeance(@RequestBody Seance seance) {
		return seanceService.modifier(seance);
	}//end updateSeance
	
	//supprimer une seance
	@RequestMapping(value = "/seances/{idSeanceA}", //
					method = RequestMethod.DELETE, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteSeance(@PathVariable("idSeanceA") Long idSeance) {
		return seanceService.supprimer(idSeance);
	}//end deleteSeance

}//end classe
