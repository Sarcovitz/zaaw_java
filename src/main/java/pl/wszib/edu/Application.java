package pl.wszib.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.wszib.edu.repos.AnimalRepo;

@SpringBootApplication
public class Application {
	private static AnimalRepo animalRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
