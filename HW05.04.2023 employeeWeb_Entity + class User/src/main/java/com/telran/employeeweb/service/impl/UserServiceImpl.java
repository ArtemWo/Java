package org.example.HW05;

import com.telran.employeeweb.model.entity.User;
import com.telran.employeeweb.repository.UserRepository;
import com.telran.employeeweb.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
	private final UserRepository userRepository;
	private UserRepository repository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getUsers() {
		return userRepository.getAll();
	}

	@Override
	public void add(User user) {
       userRepository.add(user);
	}




	@Override
	public void deleteUser(String id) {
   userRepository.deleteUser(id);
	}

	@Override
	public User getById(String id) {
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		return false;
	}

	@Override
	public boolean uppdateUser(User user) {
		List<User> users = userRepository.getAll();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(user.getId())){
				userRepository.uppdateId(user);
				return true;
			}
		}
		userRepository.add(user);
		return false;
	}

	@Override
	public List<User> getUser() {
		return userRepository.getAll();
	}
}
