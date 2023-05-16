package ru.postgre.MotoShop.repository;

import org.springframework.data.repository.CrudRepository;
import ru.postgre.MotoShop.model.Orders;

public interface IOrderRepository extends CrudRepository<Orders, Long>{

}
