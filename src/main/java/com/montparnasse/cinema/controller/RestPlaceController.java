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
import com.montparnasse.cinema.domaine.Place;
import com.montparnasse.cinema.service.IPlaceService;

/**
* Classe Controller RestPlaceController de la couche controller
* @author IN-MP-019
*
*/
@CrossOrigin("*")
@RestController
public class RestPlaceController {
	
	//recup du service
	@Autowired
	private IPlaceService placeService;
	
	//lister toutes les places
	@RequestMapping(value = "/places", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Place> getPlaces() {
		List<Place> list = placeService.recupererTout();
		return list;
	}//end getPlaces
	
	//lister une place
	@RequestMapping(value = "/places/{idPlaceA}", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Place getPlace(@PathVariable("idPlaceA") Long idPlace) {
		return placeService.recuperer(idPlace);
	}//end getPlace
	
	//ajouter une place
	@RequestMapping(value = "/places", //
					method = RequestMethod.POST, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Place addPlace(@RequestBody Place place) {
		return placeService.ajouter(place);
	}//end addPlace
	
	//modifier une place
	@RequestMapping(value = "/places", //
					method = RequestMethod.PUT, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Place updatePlace(@RequestBody Place place) {
		return placeService.modifier(place);
	}//end updateTicket
	
	//supprimer une place
	@RequestMapping(value = "/places/{idPlaceA}", //
					method = RequestMethod.DELETE, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deletePlace(@PathVariable("idPlaceA") Long idPlace) {
		return placeService.supprimer(idPlace);
	}//end deletePlace
	
	// ====== Liste des cinemas pour une ville donnée ========== //
	@RequestMapping(value = "/places/salles/{idSalleA}", 
					method = RequestMethod.GET, 
					produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Place> recupererPlacesDeSalle(@PathVariable("idSalleA") Long idSalle) {
		List<Place> listePlaces = placeService.rechercherParSalle(idSalle);
		return listePlaces;
	}//end recupererPlacesDeSalle
	

}//end class
