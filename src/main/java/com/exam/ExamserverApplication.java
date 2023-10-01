package com.exam;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	public static void main(String[] args) {

		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting Code");

		User user =new User();

		user.setEmail("abc@gmail.com");
		user.setFirstname("Yash");
		user.setLastname("Garg");
		user.setPassword("abc");
		user.setUsername("Yash123");

		user.setProfile("default.png");

		Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");

		UserRole userrole = new UserRole();
		userrole.setUser(user);
		userrole.setRole(role1);

		Set<UserRole> userRoleSet = new HashSet<>();
		userRoleSet.add(userrole);

		User user1 = this.userService.createUser(user,userRoleSet);
		System.out.println(user1);
	}
}
