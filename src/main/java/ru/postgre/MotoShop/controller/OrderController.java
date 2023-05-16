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

import ru.postgre.MotoShop.model.Orders;
import ru.postgre.MotoShop.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/orders")
	public List<Orders> showAllOrders() {	
		return service.getAllOrder();
    }

    @GetMapping("/orders/{id_order}")
    public ResponseEntity<Orders> showOrder(@PathVariable Long id_order) {
    	Orders res = service.findOrder(id_order);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/orders")
    public ResponseEntity<Orders> addNewOrder(@RequestBody Orders order) {
    	Orders res = service.addOrder(order);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/orders")
    public ResponseEntity<Orders> updateOrder(@RequestBody Orders order) {
    	Orders res = service.updateOrder(order);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/orders/{id_order}")
    public ResponseEntity<Orders> deleteOrder(@PathVariable Long id_order) {
        service.deleteOrder(id_order);
        return ResponseEntity.ok(null);
    }

}
