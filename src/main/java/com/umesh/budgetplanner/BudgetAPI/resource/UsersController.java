package com.umesh.budgetplanner.BudgetAPI.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umesh.budgetplanner.BudgetAPI.repository.UserRepository;
import com.umesh.budgetplanner.BudgetAPI.user.Users;

@RestController
public class UsersController {
	
	private UserRepository userRepository;

	public UsersController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<Users> getUsers(){
		return userRepository.findAll();
	}
}
