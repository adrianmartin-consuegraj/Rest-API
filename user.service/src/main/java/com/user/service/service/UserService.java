// 2. UserRepository is linked through the creation of the userRepo attribute which is an object type 'UserRepository'

package com.user.service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.service.model.User;
import com.user.service.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	// get all users
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
	// get one user by id
	// with the method 'orElse(null)' we can control that exception providing a null in case there's no User found
	public User getUserById(int id) {
		return userRepo.findById(id).orElse(null);
	}

	// save an user
	public User save(User user) {
		User newUser = userRepo.save(user);
		return newUser;
	}
}
