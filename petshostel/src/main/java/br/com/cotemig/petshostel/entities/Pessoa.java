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
@Table(name = "tb_pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String nome;
	//private Endereco endereco;
	private String cpf;
	private String rg;
	private String uf_nascimento;
	
	public Pessoa(Long id, String nome, Endereco endereco, String cpf, String rg, String uf_nascimento) {
		this.id = id;
		this.nome = nome;
		//this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.uf_nascimento = uf_nascimento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/*public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}*/
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getUf_nascimento() {
		return uf_nascimento;
	}
	public void setUf_nascimento(String uf_nascimento) {
		this.uf_nascimento = uf_nascimento;
	}
}