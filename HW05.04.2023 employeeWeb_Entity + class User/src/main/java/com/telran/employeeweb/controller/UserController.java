package org.example.HW05;

import com.telran.employeeweb.model.entity.User;
import com.telran.employeeweb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController{

	private final UserService userService;


	public UserController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping
	public String getAll(Model model){
		List<User> users=userService.getUsers();
		model.addAttribute("userss", users);
		return "userss";
	}
	@GetMapping("/{id}")
	public String getById(Model model, @PathVariable String id) {
		User userById = userService.getById(id);
		model.addAttribute("userById", userById);
		return "user";
	}
}
