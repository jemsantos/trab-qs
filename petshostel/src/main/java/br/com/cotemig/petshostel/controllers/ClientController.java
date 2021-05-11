/**
 * 
 */
package br.com.cotemig.petshostel.controllers;

import java.net.URI;
import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.cotemig.petshostel.dto.ClientDTO;
import br.com.cotemig.petshostel.dto.ClientInsertDTO;
import br.com.cotemig.petshostel.services.ClientService;

/**
 * @author José Eustaquio Muniz
 *
 */
@RestController
@RequestMapping(value = "/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
		ClientDTO client = clientService.findById(id);

		return ResponseEntity.ok(client);
	}

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> list = clientService.findAll();

		return ResponseEntity.ok(list);
	}

	@PostMapping
	public ResponseEntity<ClientDTO> insert(@RequestBody ClientInsertDTO dto) {
		try {
			ClientDTO obj = clientService.insert(dto);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(obj.getId()).toUri();

			return ResponseEntity.created(uri).body(obj);
		} catch (ServiceException e) {
			return ResponseEntity.unprocessableEntity().build();
		}
	}

}
