package ru.postgre.MotoShop.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.postgre.MotoShop.model.Orders;
import ru.postgre.MotoShop.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService{
	
	@Autowired
	IOrderRepository orderRepository;

	@Override
	public Orders addOrder(Orders order) {
		try {
			return orderRepository.save(order);			
		}catch (Exception e) {			
			return null;
		}
	}

	@Override
	public Orders updateOrder(Orders order) {
		try {
			return orderRepository.save(order);			
		}catch (Exception e) {			
			return null;
		}
	}

	@Override
	public ArrayList<Orders> getAllOrder() {
		return (ArrayList<Orders>) orderRepository.findAll();
	}

	@Override
	public Orders findOrder(Long id) {
		return orderRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);
		
	}

}
