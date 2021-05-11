/**
 * 
 */
package br.com.cotemig.petshostel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotemig.petshostel.entities.Product;

/**
 * @author José Eustaquio Muniz
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByName(String name);
	
	/*
	 * 	/ * metodo customizado * /
	 *	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
	 *			+ " FROM Sale AS obj GROUP BY obj.seller")
	 *	List<SaleSumDTO> amountGroupedBySeller();
	 */

}
