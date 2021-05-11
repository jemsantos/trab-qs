/**
 * 
 */
package br.com.cotemig.petshostel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotemig.petshostel.entities.Endereco;
import br.com.cotemig.petshostel.repositories.EnderecoRepository;

/**
 * @author Brian Alves Pereira
 *
 */
@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository repository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable Long id) {
		Endereco endereco = repository.findById(id).get();
		return ResponseEntity.ok(endereco);
	}

}
