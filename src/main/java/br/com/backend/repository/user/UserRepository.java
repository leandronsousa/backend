package br.com.backend.repository.user;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.backend.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, UUID> {
	
	boolean existsByEmail(String email);
	
	Optional<User> findByEmail(String email);

}