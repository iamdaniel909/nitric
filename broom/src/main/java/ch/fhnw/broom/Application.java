package ch.fhnw.broom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.fhnw.broom.business.service.CatalogueService;
import ch.fhnw.broom.data.domain.Product;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private CatalogueService CatalogueService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping(value="/")
	public String getWelcomeString() {
		return "Welcome to ye ole broom shoppe!";
	}

}
