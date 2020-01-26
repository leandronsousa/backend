package br.com.tiss.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class AbstractController<T> {
	
//	private static final String SAVE_SUCCESS = "Registro salvo com sucesso!";
//	private static final String UPDATE_SUCCESS = "Registro alterado com sucesso!";
//	private static final String INTERNAL_ERROR = "Erro interno!";
//	private static final String NOT_FOUND = "Registro nao encontrado!";

	protected ResponseEntity<T> created(T t) {
		return new ResponseEntity<T>(t, HttpStatus.CREATED);
	}
	
	protected ResponseEntity<T> patched() {
		return new ResponseEntity<T>(HttpStatus.OK);
	}
	
	protected ResponseEntity<List<T>> getList(List<T> t) {
		return new ResponseEntity<List<T>>(t, HttpStatus.OK);
	}

	protected ResponseEntity<T> error() {
		return new ResponseEntity<T>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	protected ResponseEntity<List<T>> errorList() {
		return new ResponseEntity<List<T>>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	protected ResponseEntity<T> notFound() {
		return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
	}
	
	protected ResponseEntity<List<T>> notFoundList() {
		return new ResponseEntity<List<T>>(HttpStatus.NOT_FOUND);
	}
	
	protected ResponseEntity<T> get(T t) {
		return new ResponseEntity<T>(t, HttpStatus.OK);
	}

}
