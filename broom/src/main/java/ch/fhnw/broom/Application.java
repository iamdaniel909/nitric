package ch.fhnw.broom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.fhnw.broom.business.service.CatalogueService;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private CatalogueService catalogueService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping(value="/")
	public String getWelcomeString() {
		return "Welcome to ye ole broom shoppe!";
	}

}
