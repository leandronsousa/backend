package br.com.tiss.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Operadora implements Serializable {

	private static final long serialVersionUID = -2788065631740146950L;

	@Id
	private Long id;

	private String name;

	private Integer code;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
