/**
 * 
 */
package br.com.cotemig.petshostel.controllers;

import java.net.URI;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.cotemig.petshostel.dto.ProductDTO;
import br.com.cotemig.petshostel.dto.ProductInsertDTO;
import br.com.cotemig.petshostel.services.ProductService;

/**
 * @author José Eustaquio Muniz
 *
 * http://localhost:8080/products?page=0&size=10&sort=date,desc
 */
@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
		ProductDTO product = productService.findById(id);
		
		return ResponseEntity.ok(product);
	}

	@GetMapping
	public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable) {
		Page<ProductDTO> list = productService.findAll(pageable);

		return ResponseEntity.ok(list);
	}

	@PostMapping
	public ResponseEntity<ProductDTO> insert(@RequestBody ProductInsertDTO dto) {
		try {
			ProductDTO obj = productService.insert(dto);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(obj.getId()).toUri();

			return ResponseEntity.created(uri).body(obj);
		} catch (ServiceException e) {
			return ResponseEntity.unprocessableEntity().build();
		}
	}

	/*
	 * @GetMapping(value = "/amount-by-seller")
	 * public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
	 *     List<SaleSumDTO> list = service.amountGroupedBySeller();
	 *
	 *     return ResponseEntity.ok(list);
	 * }
	 */

}
