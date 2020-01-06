package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dto.ClientDto;
import com.abc.entities.ClientEntity;
import com.abc.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
 
	public void saveClient(ClientDto dto) {
		ClientEntity ce = new ClientEntity();
		ce.setName(dto.getName());
		ce.setDomain(dto.getDomain());
		ce.setUrl(dto.getUrl());
		ce.setSecret_key(dto.getKey());
 	}

	public ClientDto getClient(String name) {
		ClientEntity cen = clientRepository.findByName(name);
		return convert(cen);
	}

	public ClientDto convert(ClientEntity ce) {
		ClientDto dto = null;
		if (ce != null) {

			dto = new ClientDto();
			dto.setName(ce.getName());
			dto.setUrl(ce.getUrl());
			dto.setKey(ce.getSecret_key());
 			dto.setDomain(ce.getDomain());

		}

 		return dto;

	}

}
