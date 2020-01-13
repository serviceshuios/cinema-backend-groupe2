package com.montparnasse.cinema.service;

public interface IGeneriqueService <T> {
	
	public T ajouter(T t);
	public T get(Long id);
	public T modifier(T t);
	public boolean supprimer(T t);

}
