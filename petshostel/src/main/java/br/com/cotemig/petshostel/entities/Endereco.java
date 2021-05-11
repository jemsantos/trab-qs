/**
 * 
 */
package br.com.cotemig.petshostel.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Brian Alves Pereira
 *
 */
@Entity
@Table(name = "tb_endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String logradouro;
	private String rua;
	private String numero;
	private String complemento;
	private String uf_endereco;
	private String cep;
	private String fone;
	private String celular;
	private String email;
	
	public Endereco() {}

	public Endereco(Long id, String logradouro, String rua, String numero, String complemento, String uf_endereco, String cep,
			String fone, String celular, String email) {
		this.id = id;
		this.logradouro = logradouro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.uf_endereco = uf_endereco;
		this.cep = cep;
		this.fone = fone;
		this.celular = celular;
		this.email = email;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getUf() {
		return uf_endereco;
	}

	public void setUf(String uf_endereco) {
		this.uf_endereco = uf_endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
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
