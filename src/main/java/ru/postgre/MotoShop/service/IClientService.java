package ru.postgre.MotoShop.service;

import ru.postgre.MotoShop.model.Client;
import java.util.ArrayList;

public interface IClientService {
	public Client addClient(Client client);
    public Client updateClient(Client client);
    public ArrayList<Client> getAllClients();
    public Client findClient(Long id);
    public void deleteClient(Long id);
}
