package br.com.tiss.repository.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import br.com.tiss.repository.CustomRepository;

@Repository
public class CustomUserRepository implements CustomRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
}
