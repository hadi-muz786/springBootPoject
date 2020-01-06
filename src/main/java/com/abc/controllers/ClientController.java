package com.abc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dto.ClientDto;
import com.abc.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveClient(@RequestBody ClientDto dto) {
		clientService.saveClient(dto);

	}

	@RequestMapping(value = "name/{name}", method = RequestMethod.GET)
	public ClientDto getClineByName(@PathVariable String name) {
		return clientService.getClient(name);

	}

}
