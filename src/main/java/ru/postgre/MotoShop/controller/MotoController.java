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

import ru.postgre.MotoShop.model.Motorcycle;
import ru.postgre.MotoShop.service.MotoService;

@RestController
public class MotoController {
	
	@Autowired
	private MotoService service;
	
	@GetMapping("/motocycles")
	public List<Motorcycle> showAllMotorcycles() {	
		return service.getAllMotorcycle();
    }

    @GetMapping("/motocycles/{id_moto}")
    public ResponseEntity<Motorcycle> showMotorcycle(@PathVariable Long id_moto) {
        Motorcycle res = service.findMotorcycle(id_moto);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/motocycles")
    public ResponseEntity<Motorcycle> addNewMotorcycle(@RequestBody Motorcycle moto) {
        Motorcycle res = service.addMotorcycle(moto);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/motocycles")
    public ResponseEntity<Motorcycle> updateMotorcycle(@RequestBody Motorcycle moto) {
    	Motorcycle res = service.updateMotorcycle(moto);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/motocycles/{id_moto}")
    public ResponseEntity<Motorcycle> deleteMotorcycle(@PathVariable Long id_moto) {
        service.deleteMotorcycle(id_moto);
        return ResponseEntity.ok(null);
    }
}
