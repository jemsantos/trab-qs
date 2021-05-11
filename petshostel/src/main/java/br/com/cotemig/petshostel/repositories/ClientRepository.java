/**
 * 
 */
package br.com.cotemig.petshostel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotemig.petshostel.entities.Client;

/**
 * @author José Eustaquio Muniz
 *
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findByEmail(String email);

}
