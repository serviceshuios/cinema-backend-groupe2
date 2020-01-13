package com.montparnasse.cinema.service;

import java.util.List;

public interface IGeneriqueService <T> {
	
	public T ajouter(T t);
	public T recuperer(Long id);
	public T modifier(T t);
	public boolean supprimer(T t);
	public List<T> recupererTout();

}
