package br.com.tiss.service;

import java.util.Optional;

import br.com.tiss.model.User;

public interface UserCrudService extends CrudService<User, Long> {
	
	boolean existsByEmail(String email);
	
	Optional<User> findByEmail(String email);

}