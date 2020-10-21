package com.erfan.springjwt;

import com.erfan.springjwt.models.ERole;
import com.erfan.springjwt.models.Role;
import com.erfan.springjwt.models.User;
import com.erfan.springjwt.repository.RoleRepository;
import com.erfan.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

//	@Bean
//	public CommandLineRunner demoData(UserRepository userRepository) {
//		return args -> {
//			User user = new User("erfan",
//					"mderfan2@gmail.com",
//					encoder.encode("123456"));
//			Set<Role> roles = new HashSet<>();
//			Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
//					.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//			roles.add(adminRole);
//			user.setRoles(roles);
//
//			if (userRepository.existsByUsername("erfan")) {
//				userRepository.save(user);
//			}
//		};
//	}

}
