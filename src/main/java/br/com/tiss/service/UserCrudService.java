package br.com.tiss.service;

import br.com.tiss.model.User;

public interface UserCrudService extends CrudService<User, Long> {
	
	boolean existsByEmail(String email);

}