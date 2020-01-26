package br.com.tiss.repository.user;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.tiss.model.Operadora;

@Repository
public interface OperadoraRepository extends MongoRepository<Operadora, UUID> {

}
