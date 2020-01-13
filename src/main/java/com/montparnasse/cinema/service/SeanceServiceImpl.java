package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.ISeanceDao;
import com.montparnasse.cinema.domaine.Seance;

/**
 * Classe PSeanceServiceImpl de la couche service
 * implemente l'interface ISeanceService
 * @author IN-MP-019
 *
 */
@Service
public class SeanceServiceImpl implements ISeanceService {
	
	//recup de la dao
	@Autowired
	private ISeanceDao seanceDao;

		@Override
		public Seance ajouter(Seance s) {
			seanceDao.save(s);
			return s;
		}//end ajouter

		@Override
		public Seance recuperer(Long idSeance) {
			return seanceDao.findById(idSeance).get();
		}//end recuperer

		@Override
		public Seance modifier(Seance s) {
			seanceDao.save(s);
			return s;
		}//end modifier

		@Override
		public boolean supprimer(Long idSeance) {
			seanceDao.deleteById(idSeance);
			return true;
		}//end supprimer

		@Override
		public List<Seance> recupererTout() {
			return seanceDao.findAll();
		}//end recupererTout

}// end dao
