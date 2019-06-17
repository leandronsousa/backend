package br.com.tiss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.tiss.model.User;
import br.com.tiss.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET, value = "/user/{email}")
	@ResponseBody
	public User findByEmail(@PathVariable String email) {
		return userService.findByEmail(email).get(); 
	}
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET, value = "/user/list")
	@ResponseBody
	public List<User> list() {
		return userService.findAll(); 
	}
	
	@PreAuthorize("#oauth2.hasScope('write')")
	@RequestMapping(method = RequestMethod.POST, value = "/user/save")
	@ResponseBody
	public User save(@RequestBody User user) {
		return userService.save(user); 
	}
	
}
