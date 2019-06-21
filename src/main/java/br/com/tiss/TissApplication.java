package br.com.tiss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tiss.model.User;
import br.com.tiss.service.UserService;

@SpringBootApplication
public class TissApplication implements CommandLineRunner {
	
	private @Autowired UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TissApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = createUser();
//		this.userService.save(user);
	}

	private User createUser() {
		User user = new User();
		user.setEmail("leandro@gmail.com");
		user.setName("Leandro");
		user.setPassword("123456");
		return user;
	}

}
