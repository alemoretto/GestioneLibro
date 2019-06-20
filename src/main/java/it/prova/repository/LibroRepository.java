package it.prova.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import it.prova.model.Libro;

public interface LibroRepository extends CrudRepository<Libro, Long>,QueryByExampleExecutor <Libro> {

}
