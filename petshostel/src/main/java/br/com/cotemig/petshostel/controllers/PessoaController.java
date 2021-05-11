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

import br.com.cotemig.petshostel.entities.Pessoa;
import br.com.cotemig.petshostel.repositories.PessoaRepository;

/**
 * @author Brian Alves Pereira
 *
 */
@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable Long id) {
		Pessoa pessoa = repository.findById(id).get();
		return ResponseEntity.ok(pessoa);
	}

}
