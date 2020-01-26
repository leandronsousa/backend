package br.com.tiss.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.tiss.model.User;
import br.com.tiss.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController extends AbstractController<User> implements IController<User, UUID> {	

	@Autowired
	private UserService userService;
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET, value = "/{email}")
	@ResponseBody
	public ResponseEntity<User> findByEmail(@PathVariable String email) {
		try {
			Optional<User> opt = userService.findByEmail(email);
			if (opt.isEmpty()) {
				return notFound();
			}
			return get(opt.get());
		} catch (Exception e) {
			return error();
		}
	}
	
	@Override
	public ResponseEntity<List<User>> list() {
		try {
			List<User> list = userService.findAll();
			if (CollectionUtils.isEmpty(list)) {
				return getList(list);
			}
			return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.OK) ;
			
		} catch (Exception e) {
			return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	public ResponseEntity<User> save(@RequestBody User user) {
		try {
			userService.save(user);
			return created(user);
		} catch (Exception e) {
			return error();
		}
	}
	
	@Override
	public ResponseEntity<User> update(@RequestBody User user) {
		try {
			userService.update(user);
			return patched();
		} catch (Exception e) {
			return error();
		}
	}

	@Override
	public ResponseEntity<User> findById(UUID id) {
		return null;
	}

}
