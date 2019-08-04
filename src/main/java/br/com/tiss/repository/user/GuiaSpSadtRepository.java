package br.com.tiss.repository.user;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.tiss.model.GuiaSpSadt;

@Repository
public interface GuiaSpSadtRepository extends MongoRepository<GuiaSpSadt, UUID> {

}
