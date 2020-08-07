package com.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

/**Project: springUserApi
 * File: UserService.java
 * @author jaime
 * Em 06-08-2020 **/

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	//Get all
	public List<User> getAll (){
		return userRepo.findAll();
	}
	//Get By Id
	public User getById (String id) {
		Optional<User> obj = userRepo.findById(id);
		if (obj == null) {
			System.out.println("Ops... Objeto não encontrado!");
		}
		return obj.get();
	}
	//Create/Save
	public User save (User user) {
		return userRepo.save(user);
	}
	//Delete
	public void delete (String id) {
		getById(id);
		userRepo.deleteById(id);
	}
}
