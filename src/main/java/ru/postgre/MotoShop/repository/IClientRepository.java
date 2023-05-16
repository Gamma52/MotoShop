package ru.postgre.MotoShop.repository;

import org.springframework.data.repository.CrudRepository;
import ru.postgre.MotoShop.model.Client;

public interface IClientRepository extends CrudRepository<Client, Long>{

}
