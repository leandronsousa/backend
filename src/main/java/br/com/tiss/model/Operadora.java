package br.com.tiss.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;

public class Operadora implements Serializable {

	private static final long serialVersionUID = -2788065631740146950L;

	@Id
	private UUID id;

	private String nome;

	private Integer codigo;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
