package br.com.tiss.repository.user;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.tiss.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
	
	boolean existsByEmail(String email);
	
	Optional<User> findByEmail(String email);

}