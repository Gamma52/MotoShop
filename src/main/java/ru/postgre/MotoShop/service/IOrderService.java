package ru.postgre.MotoShop.service;

import java.util.ArrayList;

import ru.postgre.MotoShop.model.Orders;

public interface IOrderService {
	public Orders addOrder(Orders order);
    public Orders updateOrder(Orders order);
    public ArrayList<Orders> getAllOrder();
    public Orders findOrder(Long id);
    public void deleteOrder(Long id);
}
