package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.ITicketDao;
import com.montparnasse.cinema.domaine.Ticket;

/**
 * Classe TicketServiceImpl de la couche service
 * implemente l'interface ITicketService
 * @author IN-MP-019
 *
 */
@Service
public class TicketServiceImpl implements ITicketService {
	
	//recup de la dao
	@Autowired
	private ITicketDao ticketDao;

	@Override
	public Ticket ajouter(Ticket t) {
		ticketDao.save(t);
		return t;
	}//end ajouter

	@Override
	public Ticket recuperer(Long idTicket) {
		return ticketDao.findById(idTicket).get();
	}//end recuperer

	@Override
	public Ticket modifier(Ticket t) {
		ticketDao.save(t);
		return t;
	}//end modifier

	@Override
	public boolean supprimer(Long idTicket) {
		ticketDao.deleteById(idTicket);
		return true;
	}//end supprimer

	@Override
	public List<Ticket> recupererTout() {
		return ticketDao.findAll();
	}//end recupererTout


}//end dao
