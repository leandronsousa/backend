package br.com.tiss.model;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="counter")
public class Counter implements Serializable {

	private static final long serialVersionUID = -4510940162173478878L;
	

	@Id
	private ObjectId _id;

	private Long numGuiaOperadora;
	
	private Long numGuiaPrestador;

	public Long getNumGuiaOperadora() {
		return numGuiaOperadora;
	}

	public void setNumGuiaOperadora(Long numGuiaOperadora) {
		this.numGuiaOperadora = numGuiaOperadora;
	}

	public Long getNumGuiaPrestador() {
		return numGuiaPrestador;
	}

	public void setNumGuiaPrestador(Long numGuiaPrestador) {
		this.numGuiaPrestador = numGuiaPrestador;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

}
