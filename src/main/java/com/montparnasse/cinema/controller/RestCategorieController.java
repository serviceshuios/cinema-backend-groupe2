package com.montparnasse.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montparnasse.cinema.domaine.Categorie;
import com.montparnasse.cinema.service.ICategorieService;

/**
 * Classe Controller RestCategorieController de la couche controller
 * @author IN-MP-019
 *
 */
@RestController
public class RestCategorieController {
	
	//recup du service
	@Autowired
	private ICategorieService categorieService;
	
	//lister ttes les categories
	@RequestMapping(value = "/categories", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Categorie> getCategories() {
		List<Categorie> list = categorieService.recupererTout();
		return list;
	}//end getCategories
	
	//lister une categorie
	@RequestMapping(value = "/categories/{idCategorieA}", //
					method = RequestMethod.GET, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Categorie getCategorie(@PathVariable("idCategorieA") Long idCategorie) {
		return categorieService.recuperer(idCategorie);
	}//end getCategorie
	
	//ajouter une categorie
	@RequestMapping(value = "/categories", //
					method = RequestMethod.POST, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Categorie addCategorie(@RequestBody Categorie categorie) {
		return categorieService.ajouter(categorie);
	}//end addCategorie
	
	//modifier une categorie
	@RequestMapping(value = "/categories", //
					method = RequestMethod.PUT, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Categorie updateCategorie(@RequestBody Categorie categorie) {
		return categorieService.modifier(categorie);
	}//end updateCategorie
	
	//supprimer une categorie
	@RequestMapping(value = "/categories/{idCategorieA}", //
					method = RequestMethod.DELETE, //
					produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteCategorie(@PathVariable("idCategorieA") Long idCategorie) {
		return categorieService.supprimer(idCategorie);
	}//end deleteCategorie

}//end class
