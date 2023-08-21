import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.andres.backend.usersapp.backendusersapp.models.entities.Role;
import com.andres.backend.usersapp.backendusersapp.models.entities.User;
import com.andres.backend.usersapp.backendusersapp.repositories.RoleRepository;
import com.andres.backend.usersapp.backendusersapp.repositories.UserRepository;


@Component
public class AdminUserCommandLineRunner implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    private final Logger logger = LoggerFactory.getLogger(AdminUserCommandLineRunner.class);


    public AdminUserCommandLineRunner(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    /* 

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        // Crear el rol de administrador si no existe
        logger.info("Creando usuario......................");
        logger.info(")))))))))))))))))))))))))))))))))))))))))))))))");
        Optional<Role> adminRole = roleRepository.findByName("ROLE_ADMIN");
        if (!adminRole.isPresent()) {
            adminRole = Optional.of(new Role("ROLE_ADMIN"));
            roleRepository.save(adminRole.get());
        }

        // Crear el usuario con el rol de administrador
        User adminUser = new User();
        adminUser.setUsername("jotxee");
        adminUser.setPassword(passwordEncoder.encode("jotxee")); // Encriptar la contraseña
        adminUser.setRoles(List.of(adminRole.get()));

        userRepository.save(adminUser);
    }*/

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Loading data...");
         logger.info("????????????????????????????????????????????????????????????????????????????????????????.");
    }
}