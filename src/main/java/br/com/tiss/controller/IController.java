package br.com.tiss.controller;

import java.util.List;

public interface IController<T, ID> {

	T findById(ID id);
	
	List<T> list();
	
	T save(T t);
	
	void update(T t);

}
