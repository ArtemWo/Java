package org.example.HW05;

import com.telran.employeeweb.model.entity.User;
import com.telran.employeeweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

	@RestController
	@RequestMapping("/usersRest")
	public class UserRestController {

		public UserService userService;

		@Autowired
		public UserRestController(UserService userService) {
			this.userService = userService;
		}

		@GetMapping
		public List<User> getUser(){
			return userService.getUser();
		}

		@PostMapping
		public User addUser(@RequestBody User user){
			userService.add(user);
			return user;
		}

		@PutMapping
		public ResponseEntity<User> updateUser(@RequestBody User user){
			boolean isUpdated = userService.updateUser(user);
			if (isUpdated){
				return new ResponseEntity<>(user, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(user, HttpStatus.CREATED);
			}
		}

		@DeleteMapping(value = "/{id}")
		public void deleteUser(@PathVariable String id){
			System.out.println("Deleting:" + id);
			userService.deleteUser(id);
		}
	}

