/**
 * 
 */
package br.com.cotemig.petshostel.dto;

import java.io.Serializable;

import br.com.cotemig.petshostel.entities.Client;

/**
 * @author Jose Eustaquio Muniz
 *
 * contém somente os dados que serão disponibilizados para o back-end
 */
public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	
	public ClientDTO() {}

	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public ClientDTO(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	/**
	 * @param entity (Client)
	 */
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
