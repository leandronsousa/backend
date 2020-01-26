package br.com.tiss.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

import br.com.tiss.model.Operadora;
import br.com.tiss.repository.user.OperadoraRepository;

@Service
public class OperadoraService implements OperadoraCrudService {
	
	@Autowired
	private OperadoraRepository operadoraRepository;

	@Override
	public <S extends Operadora> S save(S entity) {
		entity.setId(new UUIDGenerator().generateId(entity));
		return operadoraRepository.insert(entity);
	}

	@Override
	public <S extends Operadora> Iterable<S> saveAll(Iterable<S> entities) {
		return operadoraRepository.saveAll(entities);
	}

	@Override
	public Optional<Operadora> findById(UUID id) {
		return operadoraRepository.findById(id);
	}

	@Override
	public boolean existsById(UUID id) {
		return operadoraRepository.existsById(id);
	}

	@Override
	public List<Operadora> findAll() {
		return operadoraRepository.findAll();
	}

	@Override
	public Iterable<Operadora> findAllById(Iterable<UUID> ids) {
		return operadoraRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return operadoraRepository.count();
	}

	@Override
	public void deleteById(UUID id) {
		operadoraRepository.deleteById(id);
	}

	@Override
	public void delete(Operadora entity) {
		operadoraRepository.delete(entity);
	}

}
