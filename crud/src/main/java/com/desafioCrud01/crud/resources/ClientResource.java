package com.desafioCrud01.crud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioCrud01.crud.entities.Client;
import com.desafioCrud01.crud.services.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {
	
	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
}
