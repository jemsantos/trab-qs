/**
 * 
 */
package br.com.cotemig.petshostel.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotemig.petshostel.dto.ClientDTO;
import br.com.cotemig.petshostel.dto.ClientInsertDTO;
import br.com.cotemig.petshostel.entities.Client;
import br.com.cotemig.petshostel.repositories.ClientRepository;

/**
 * @author Jose Eustaquio Muniz
 *
 */
@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	// https://blog.algaworks.com/chega-de-nullpointerexception/
	public ClientDTO findById(Long id) {
		Optional<Client> client = Optional.ofNullable(clientRepository.findById(id).get());

		if (client.isPresent())
			return new ClientDTO(client.get());
		return null;
	}

	public List<ClientDTO> findAll() {
		List<Client> result = clientRepository.findAll();

		return result.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
	
	public ClientDTO insert(ClientInsertDTO dto) {
		Client client = clientRepository.findByEmail(dto.getEmail());
		if (client != null) {
			throw new ServiceException("E-mail já existe");
		}

		Client obj = new Client();
		obj.setName(dto.getName());
		obj.setEmail(dto.getEmail());
		
		obj = clientRepository.save(obj);
		
		return new ClientDTO(obj);
	}

	/*
	 * @Transactional(readOnly = true)
	 * public List<SaleSumDTO> amountGroupedBySeller() {
	 *     return repository.amountGroupedBySeller();
	 * }
	 */

}
