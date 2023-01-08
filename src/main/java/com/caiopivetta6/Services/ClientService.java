package com.caiopivetta6.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.Services.exceptions.ObjectNotFoundException;
import com.caiopivetta6.domain.Client;
import com.caiopivetta6.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public Client find(Integer id) {
		
		Optional<Client> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Client.class.getName()));

	}
}
