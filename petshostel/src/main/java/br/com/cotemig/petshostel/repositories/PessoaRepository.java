/**
 * 
 */
package br.com.cotemig.petshostel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotemig.petshostel.entities.Pessoa;

/**
 * @author Brian Alves Pereira
 *
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
