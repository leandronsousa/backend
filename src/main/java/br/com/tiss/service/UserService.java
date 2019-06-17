package br.com.tiss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiss.model.User;
import br.com.tiss.repository.user.UserRepository;

@Service
public class UserService implements UserCrudService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public <S extends User> S save(S entity) {
		return repository.save(entity);
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<User> findById(Long id) {
		return null;
	}
	
	@Override
	public Optional<User> findByEmail(String email) {
		return repository.findByEmail(email);
	}
	
	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
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

}
