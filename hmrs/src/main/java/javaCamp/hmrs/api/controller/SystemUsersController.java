package javaCamp.hmrs.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.hmrs.business.abstracts.SystemUserService;
import javaCamp.hmrs.business.abstracts.UserService;
import javaCamp.hmrs.entites.concretes.SystemUser;

@RestController
@RequestMapping("/api/users/systemusers/")
public class SystemUsersController {

	
	@Autowired
	SystemUserService systemUserService;

	public SystemUsersController( SystemUserService systemUserService ) {
		super();
		this.systemUserService = systemUserService;
	}

	@GetMapping("/getall")
	List<SystemUser> getAll() {
		return this.systemUserService.getAllSystemUser();
	}

}
