package com.desafioCrud01.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafioCrud01.crud.entities.Client;
import com.desafioCrud01.crud.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll(){		
		return repository.findAll();
	}
}
