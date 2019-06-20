package it.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.prova.model.Libro;
import it.prova.repository.LibroRepository;

@Component
public class LibroServiceImpl implements LibroService {
	
	@Autowired
	private LibroRepository libroRepository;

	@Override
	public List<Libro> listAllLibri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro caricaSingolo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aggiorna(Libro libroInstance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inserisciNuovo(Libro libroInstance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rimuovi(Libro libroInstance) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Libro> findByExample(Libro example) {
		// TODO Auto-generated method stub
		return null;
	}

}
