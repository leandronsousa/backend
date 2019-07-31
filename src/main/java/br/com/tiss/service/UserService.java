package br.com.tiss.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

import br.com.tiss.model.User;
import br.com.tiss.repository.user.UserRepository;

@Service
public class UserService implements UserCrudService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public <S extends User> S save(S entity) {
		entity.setId(new UUIDGenerator().generateId(entity));
		return repository.save(entity);
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return repository.findByEmail(email);
	}
	
	public void update(User user) {
		this.repository.save(user);
	}
	
	@Override
	public boolean existsById(UUID id) {
		return false;
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public Iterable<User> findAllById(Iterable<UUID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<User> findById(UUID id) {
		return repository.findById(id);
	}

}
