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

import com.montparnasse.cinema.domaine.Ticket;
import com.montparnasse.cinema.service.ITicketService;

/**
* Classe Controller RestTicketController de la couche controller
* @author IN-MP-019
*
*/
@RestController
public class RestTicketController {
	
	//recup du service
		@Autowired
		private ITicketService ticketService;
		
		//lister toutes les tickets
		@RequestMapping(value = "/tickets", //
						method = RequestMethod.GET, //
						produces = {MediaType.APPLICATION_JSON_VALUE})
		@ResponseBody
		public List<Ticket> getTickets() {
			List<Ticket> list = ticketService.recupererTout();
			return list;
		}//end getTickets
		
		//lister un ticket
		@RequestMapping(value = "/tickets/{idTicketA}", //
						method = RequestMethod.GET, //
						produces = {MediaType.APPLICATION_JSON_VALUE})
		@ResponseBody
		public Ticket getTicket(@PathVariable("idTicketA") Long idTicket) {
			return ticketService.recuperer(idTicket);
		}//end getTicket
		
		//ajouter un ticket
		@RequestMapping(value = "/tickets", //
						method = RequestMethod.POST, //
						produces = {MediaType.APPLICATION_JSON_VALUE})
		@ResponseBody
		public Ticket addTicket(@RequestBody Ticket ticket) {
			return ticketService.ajouter(ticket);
		}//end addTicket
		
		//modifier un ticket
		@RequestMapping(value = "/tickets", //
						method = RequestMethod.PUT, //
						produces = {MediaType.APPLICATION_JSON_VALUE})
		@ResponseBody
		public Ticket updateTicket(@RequestBody Ticket ticket) {
			return ticketService.modifier(ticket);
		}//end updateTicket
		
		//supprimer un ticket
		@RequestMapping(value = "/tickets/{idTicketA}", //
						method = RequestMethod.DELETE, //
						produces = {MediaType.APPLICATION_JSON_VALUE})
		@ResponseBody
		public boolean deleteTicket(@PathVariable("idTicketA") Long idTicket) {
			return ticketService.supprimer(idTicket);
		}//end deleteTicket

}//end class
