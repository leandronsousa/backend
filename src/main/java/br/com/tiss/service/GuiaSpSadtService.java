package br.com.tiss.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

import br.com.tiss.enums.CaraterAtendimentoEnum;
import br.com.tiss.model.Counter;
import br.com.tiss.model.GuiaSpSadt;
import br.com.tiss.repository.user.GuiaSpSadtRepository;

@Service
public class GuiaSpSadtService implements GuiaSpSadtCrudService {
	
	@Autowired
	private GuiaSpSadtRepository repository;
	
	@Autowired
	private CounterService counterService;
	
	@Override
	public <S extends GuiaSpSadt> S save(S guia) {
		this.composeToSave(guia);
		return this.repository.save(guia);
	}

	private void composeToSave(GuiaSpSadt guia) {
		guia.setId(new UUIDGenerator().generateId(guia));
		Counter counter = this.counterService.findById(null).get();
		guia.setNumGuiaOperadora(counter.getNumGuiaOperadora().toString());
		guia.setNumGuiaPrestador(counter.getNumGuiaPrestador().toString());
	}

	@Override
	public <S extends GuiaSpSadt> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<GuiaSpSadt> findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<GuiaSpSadt> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<GuiaSpSadt> findAllById(Iterable<UUID> ids) {
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
	public void delete(GuiaSpSadt entity) {
		// TODO Auto-generated method stub
		
	}

	public void saveFake() {
		GuiaSpSadt g = createFake();
	}

	private GuiaSpSadt createFake() {
		GuiaSpSadt g = new GuiaSpSadt();
		g.setAtendimentoRn("N");
		g.setCaraterAtendimento(CaraterAtendimentoEnum.ELETIVO);
//		g.setCboProfissionalSolicitante(cboProfissionalSolicitante);
		return null;
	}

}
