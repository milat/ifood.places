package br.com.ifood.places;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.ifood.places")
@EntityScan(basePackages = "br.com.ifood.places.domain")
public class PlacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacesApplication.class, args);
	}

}
