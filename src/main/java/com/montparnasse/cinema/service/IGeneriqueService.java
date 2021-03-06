package com.montparnasse.cinema.service;

import java.util.List;

public interface IGeneriqueService <T> {
	
	public T ajouter(T t);
	public T recuperer(Long id);
	public T modifier(T t);
	public boolean supprimer(Long id);
	public List<T> recupererTout();

}
