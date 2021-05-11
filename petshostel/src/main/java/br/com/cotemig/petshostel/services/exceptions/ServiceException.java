/**
 * 
 */
package br.com.cotemig.petshostel.services.exceptions;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ServiceException(String msg) {
		super(msg);
	}

}
