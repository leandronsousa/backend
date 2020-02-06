package br.com.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IController<T, ID> {

	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseBody
	ResponseEntity<T> findById(ID id);

	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	ResponseEntity<List<T>> list();

	@PreAuthorize("#oauth2.hasScope('write')")
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	ResponseEntity<T> save(T t);

	@PreAuthorize("#oauth2.hasScope('write')")
	@RequestMapping(method = RequestMethod.PATCH)
	@ResponseBody
	ResponseEntity<T> update(T t);

}
