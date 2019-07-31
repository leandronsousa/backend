package br.com.tiss.service;

import java.util.Optional;
import java.util.UUID;

import br.com.tiss.model.User;

public interface UserCrudService extends CrudService<User, UUID> {
	
	boolean existsByEmail(String email);
	
	Optional<User> findByEmail(String email);
	
	Optional<User> findById(UUID id);

}