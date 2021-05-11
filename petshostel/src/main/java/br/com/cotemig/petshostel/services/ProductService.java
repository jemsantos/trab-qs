/**
 * 
 */
package br.com.cotemig.petshostel.services;

import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cotemig.petshostel.dto.ProductDTO;
import br.com.cotemig.petshostel.dto.ProductInsertDTO;
import br.com.cotemig.petshostel.entities.Product;
import br.com.cotemig.petshostel.repositories.ProductRepository;

/**
 * @author Jose Eustaquio Muniz
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public ProductDTO findById(Long id) {
		Optional<Product> product = Optional.ofNullable(productRepository.findById(id).get());

		if (product.isPresent())
			return new ProductDTO(product.get());
		return null;
	}
	
	@Transactional(readOnly = true)
	public Page<ProductDTO> findAll(Pageable pageable) {
		/* fazer um cache dos sellers */
		//sellerRepository.findAll(); MANYTOONE

		Page<Product> result = productRepository.findAll(pageable);

		return result.map(x -> new ProductDTO(x));
	}
	
	public ProductDTO insert(ProductInsertDTO dto) {
		Product product = productRepository.findByName(dto.getName());
		if (product != null) {
			throw new ServiceException("Produto já existe");
		}

		Product obj = new Product();
		obj.setName(dto.getName());
		obj.setPrice(dto.getPrice());
		obj.setDescription(dto.getDescription());
		
		obj = productRepository.save(obj);
		
		return new ProductDTO(obj);
	}

}
