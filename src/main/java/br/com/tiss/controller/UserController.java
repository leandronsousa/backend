package br.com.tiss.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

import br.com.tiss.model.User;
import br.com.tiss.service.GuiaSpSadtService;
import br.com.tiss.service.UserService;

@Controller
public class UserController extends br.com.tiss.controller.Controller {	

	@Autowired
	private UserService userService;
	
	@Autowired
	private GuiaSpSadtService s;

	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	@ResponseBody
	public User findByEmail(@PathVariable String id) {
		User user = userService.findById(UUID.fromString(id)).get();
		if (user == null) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		return user;
		 
	}
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET, value = "/user/list")
	@ResponseBody
	public List<User> list() {
		s.saveFake();
		return userService.findAll();
	}
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.POST, value = "/user/save")
	@ResponseBody
	public ResponseEntity<String> save(@RequestBody User user) {
		try {
			userService.save(user);
			return created();
		} catch (Exception e) {
			return error();
		}
	}
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.PATCH, value = "/user/update")
	@ResponseBody
	public ResponseEntity<String> update(@RequestBody User user) {
		try {
			userService.update(user);
			return updated();
		} catch (Exception e) {
			return error();
		}
	}

}
