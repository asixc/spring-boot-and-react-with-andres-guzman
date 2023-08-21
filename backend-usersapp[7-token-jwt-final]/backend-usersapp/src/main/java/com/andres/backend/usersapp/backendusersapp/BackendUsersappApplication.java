package com.andres.backend.usersapp.backendusersapp;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.andres.backend.usersapp.backendusersapp.models.entities.Role;
import com.andres.backend.usersapp.backendusersapp.models.entities.User;
import com.andres.backend.usersapp.backendusersapp.repositories.RoleRepository;
import com.andres.backend.usersapp.backendusersapp.repositories.UserRepository;


@SpringBootApplication
public class BackendUsersappApplication {

	private final Logger logger = LoggerFactory.getLogger(BackendUsersappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendUsersappApplication.class, args);
	}
/*
	 @Bean
    public CommandLineRunner runner(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
			
			logger.info("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.");
			 logger.info("Creando usuario......................");
        
        Optional<Role> adminRole = roleRepository.findByName("ROLE_ADMIN");
        if (!adminRole.isPresent()) {
            adminRole = Optional.of(new Role("ROLE_ADMIN"));
            roleRepository.save(adminRole.get());
        }

        // Crear el usuario con el rol de administrador
        User adminUser = new User();
        adminUser.setUsername("jotxee");
		adminUser.setEmail("jotxee@mail.com");
        adminUser.setPassword(passwordEncoder.encode("jotxee")); // Encriptar la contraseña
        adminUser.setRoles(List.of(adminRole.get()));

        userRepository.save(adminUser);
		logger.info("... Usuario creado..");
        };
    }
	 */

}
