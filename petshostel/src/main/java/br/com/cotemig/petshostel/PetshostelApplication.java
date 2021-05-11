package br.com.cotemig.petshostel;

import java.util.Arrays;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cotemig.petshostel.entities.Client;
import br.com.cotemig.petshostel.entities.Product;
import br.com.cotemig.petshostel.repositories.ClientRepository;
import br.com.cotemig.petshostel.repositories.ProductRepository;

@SpringBootApplication
public class PetshostelApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(PetshostelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Considerar ponto ao invés de vírgula.
		Locale.setDefault(Locale.US);


		// salvando um client por vez
		Client c1 = new Client(null, "Jhon Doe", "john.doe@gmail.com");
		clientRepository.save(c1);
		
		Client c2 = new Client(null, "Monique Evens", "monique.evens@gmail.com");
		clientRepository.save(c2);
		// salvando um client por vez - FIM


		// salvando os 2 produtos de uma vez só
		Product p1 = new Product(null, "Ração Pitdog", 50.00, "Ração para chachorros adultos");
		Product p2 = new Product(null, "Shampoo Dolly", 15.00, "Shampoo especial para banho em gatos e chachorros");
		productRepository.saveAll(Arrays.asList(p1, p2));
		// salvando os 2 produtos de uma vez só - FIM

	}

}
