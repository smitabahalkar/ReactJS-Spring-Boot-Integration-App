package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ravi", "Jain", "ravijain@infosys.com"));
		this.userRepository.save(new User("Smita", "Bahalkar", "smitasuresh.b@infosys.com"));
		this.userRepository.save(new User("Rutika", "Patel", "rutikapatel@infosys.com"));
		this.userRepository.save(new User("Satish", "Avalamanda", "satish.a@infosys.com"));
	}

}
