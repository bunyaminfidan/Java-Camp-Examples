package javaCamp.hmrs.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hmrs.business.abstracts.UserService;
import javaCamp.hmrs.entites.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	UserService userService;


	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getall")
	List<User> getall() {
		return this.userService.getAll();
	}

}
