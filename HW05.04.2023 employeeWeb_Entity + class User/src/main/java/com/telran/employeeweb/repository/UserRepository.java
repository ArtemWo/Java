package org.example.HW05;
import com.telran.employeeweb.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
@Repository
public class UserRepository {
		private List <User> users = new ArrayList<>();

		public UserRepository() {
			users.addAll(Arrays.asList(
					new User(UUID.randomUUID().toString(), "admin", "123", "ROLEADMIN", "111@gmail.com"),
					new User(UUID.randomUUID().toString(), "editor1", "123", "ROLEUSER", "222@gmail.com"),
					new User(UUID.randomUUID().toString(), "editor2", "123", "ROLE_USER", "333@gmail.com")
			));
		}
		public List<User> getAll(){
			return users;
		}
		public User getById(String id) {
			return users.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
		}

		public void add(User user){
			users.add(user);
		}

		public void uppdateId(User user){
			for(int i = 0; i < users.size(); i++){
				if(users.get(i).getId().equals(user.getId())){
					users.set(i, user);
				}
			}
		}

	public void deleteUser(String id) {
		users.removeIf(user -> user.getId().equals(id));
	}
	}
