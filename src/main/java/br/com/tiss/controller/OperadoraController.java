package br.com.tiss.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tiss.model.Operadora;
import br.com.tiss.service.OperadoraService;

@RequestMapping(value = "/operadora")
@Controller
public class OperadoraController extends AbstractController<Operadora> implements IController<Operadora, UUID> {

	@Autowired
	private OperadoraService operadoraService;

	@Override
	public ResponseEntity<Operadora> save(@RequestBody Operadora operadora) {
		try {
			operadoraService.save(operadora);
			return created(operadora);
		} catch (Exception e) {
			return error();
		}
	}
	
	@Override
	public ResponseEntity<List<Operadora>> list() {
		try {
			List<Operadora> list = operadoraService.findAll();
			if (CollectionUtils.isEmpty(list)) {
				return notFoundList();
			}
			return getList(list);
		} catch (Exception e) {
			return errorList();
		}
		
	}

	@Override
	public ResponseEntity<Operadora> findById(UUID id) {
		try {
			Optional<Operadora> opt = operadoraService.findById(id);
			if (opt.isEmpty()) {
				return notFound();
			}
			return get(opt.get());
		} catch (Exception e) {
			return error();
		}
	}

	@Override
	public ResponseEntity<Operadora> update(Operadora operadora) {
		return null;
	}

}
