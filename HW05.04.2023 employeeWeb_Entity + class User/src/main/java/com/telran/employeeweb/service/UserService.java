package org.example.HW05;

import com.telran.employeeweb.model.entity.User;

import java.util.List;

public interface UserService{
	List<User> getUsers();

	void add(User user);

	boolean uppdateUser(User user);

	void deleteUser(String id);

	User getById(String id);

	boolean updateUser(User user);

	List<User> getUser();
}


