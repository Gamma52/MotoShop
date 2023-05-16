package ru.postgre.MotoShop.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.postgre.MotoShop.repository.IClientRepository;
import ru.postgre.MotoShop.model.Client;

@Service
public class ClientService implements IClientService{
	
	@Autowired
	private IClientRepository clientRepository;

	@Override
	public Client addClient(Client client) {
		try {
			return clientRepository.save(client);			
		}catch (Exception e) {			
			return null;
		}
	}

	@Override
	public Client updateClient(Client client) {
		try {
			return clientRepository.save(client);			
		}catch (Exception e) {			
			return null;
		}
	}

	@Override
	public ArrayList<Client> getAllClients() {		
		return (ArrayList<Client>) clientRepository.findAll();
	}

	@Override
	public Client findClient(Long id) {		
		return clientRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
		
	}
}
