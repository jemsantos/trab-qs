/**
 * 
 */
package br.com.cotemig.petshostel.dto;

import java.io.Serializable;

import br.com.cotemig.petshostel.entities.Client;

/**
 * @author Jose Eustaquio Muniz
 *
 * contém somente os dados que serão recebidos do back-end
 */
public class ClientInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String email;

	public ClientInsertDTO() {}

	/**
	 * @param name
	 * @param email
	 */
	public ClientInsertDTO(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * @param entity (Client)
	 */
	public ClientInsertDTO(Client entity) {
		this.name = entity.getName();
		this.email = entity.getEmail();
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
