/**
 * 
 */
package br.com.cotemig.petshostel.dto;

import java.io.Serializable;

import br.com.cotemig.petshostel.entities.Product;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public class ProductInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private double price;
	private String description;

	public ProductInsertDTO() {}

	/**
	 * @param name
	 * @param price
	 * @param description
	 */
	public ProductInsertDTO(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	/**
	 * @param entity (Product)
	 */
	public ProductInsertDTO(Product entity) {
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.description = entity.getDescription();
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
