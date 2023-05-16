package ru.postgre.MotoShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.postgre.MotoShop.model.Client;
import ru.postgre.MotoShop.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping("/clients")
	public List<Client> showAllClients() {	
		return service.getAllClients();
    }

    @GetMapping("/clients/{id_client}")
    public ResponseEntity<Client> showClient(@PathVariable Long id_client) {
    	Client res = service.findClient(id_client);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/clients")
    public ResponseEntity<Client> addNewClient(@RequestBody Client client) {
    	Client res = service.addClient(client);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/client")
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
    	Client res = service.updateClient(client);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/clients/{id_client}")
    public ResponseEntity<Client> deleteAnimal(@PathVariable Long id_client) {
        service.deleteClient(id_client);
        return ResponseEntity.ok(null);
    }

}
