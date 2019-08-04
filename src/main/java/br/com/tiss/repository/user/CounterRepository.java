package br.com.tiss.repository.user;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.tiss.model.Counter;

@Repository
public interface CounterRepository extends MongoRepository<Counter, ObjectId> {

}
