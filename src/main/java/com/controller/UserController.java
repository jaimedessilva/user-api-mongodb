package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.User;
import com.services.UserService;

/**Project: springUserApi
 * File: UserController.java
 * @author jaime
 * Em 06-08-2020 **/

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public List<User> listAll(){ 
		return service.getAll();
	}
	@PostMapping
	public User create (@RequestBody User user) {
		return service.save(user);
	}
	@GetMapping("/{id}")
	public User byId (@PathVariable String id) {	
		return service.getById(id);
	}
	@PutMapping("/{id}")
	public User update (@PathVariable String id, @RequestBody User user) {
		User obj = service.getById(id);
		if (obj == null) {
			System.out.println("Ops.. Objeto não encontrado");
		}
			user.setId(obj.getId());
			return service.save(user);
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable String id) {
		service.delete(id);
		}
	
}
