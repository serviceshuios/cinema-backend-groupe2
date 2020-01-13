package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.IPlaceDao;
import com.montparnasse.cinema.domaine.Place;

/**
 * Classe PlaceServiceImpl de la couche service
 * implemente l'interface IPlaceService
 * @author IN-MP-019
 *
 */
@Service
public class PlaceServiceImpl implements IPlaceService {
	
	//recup de la dao
	@Autowired
	private IPlaceDao placeDao;

		@Override
		public Place ajouter(Place p) {
			placeDao.save(p);
			return p;
		}//end ajouter

		@Override
		public Place recuperer(Long idPlace) {
			return placeDao.findById(idPlace).get();
		}//end recuperer

		@Override
		public Place modifier(Place p) {
			placeDao.save(p);
			return p;
		}//end modifier

		@Override
		public boolean supprimer(Long idPlace) {
			placeDao.deleteById(idPlace);
			return true;
		}//end supprimer

		@Override
		public List<Place> recupererTout() {
			return placeDao.findAll();
		}//end recupererTout


}//end dao
