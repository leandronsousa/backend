package br.com.tiss.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class Controller {
	
	private static final String SUCCESS = "Registro salvo com sucesso!";
	private static final String ERROR = "Erro ao salvar registro!";
	private static final String NOT_FOUND = "Registro nao encontrado!";

	protected ResponseEntity<String> created() {
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}
	
	protected ResponseEntity<String> updated() {
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}
	
	protected ResponseEntity<String> error() {
		return new ResponseEntity<String>(ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	protected ResponseEntity<String> notFound() {
		return new ResponseEntity<String>(NOT_FOUND, HttpStatus.NOT_FOUND);
	}
	
}
