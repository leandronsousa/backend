package br.com.tiss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.tiss.model.User;
import br.com.tiss.service.UserService;

@Controller
public class AuthenticationController {
	
	@Autowired
	private UserService userService;

	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	@ResponseBody
	public User login(@RequestParam String username, @RequestParam String password) {
		User user = userService.findByEmail(username).get();
		if (user.getPassword().equals(password)) {
			
		}
		return user;
	}
	
}
