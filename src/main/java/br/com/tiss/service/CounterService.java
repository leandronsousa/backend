package br.com.tiss.service;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiss.model.Counter;
import br.com.tiss.repository.user.CounterRepository;

@Service
public class CounterService implements CounterCrudService {
	
	private static final ObjectId ID = new ObjectId("5d4742dd1c9d4400005317a6");
	
	@Autowired
	private CounterRepository repository;

	@Override
	public <S extends Counter> S save(S counter) {
		counter.setNumGuiaOperadora(counter.getNumGuiaOperadora()+1);
		counter.setNumGuiaPrestador(counter.getNumGuiaPrestador()+1);
		repository.save(counter);
		return counter;
	}

	@Override
	public <S extends Counter> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<Counter> findById(ObjectId id) {
		return Optional.ofNullable(save(repository.findById(ID).get()));
	}

	@Override
	public boolean existsById(ObjectId id) {
		return false;
	}

	@Override
	public Iterable<Counter> findAll() {
		return null;
	}

	@Override
	public Iterable<Counter> findAllById(Iterable<ObjectId> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(ObjectId id) {
	}

	@Override
	public void delete(Counter entity) {
	}

}
