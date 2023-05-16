package ru.postgre.MotoShop.repository;

import org.springframework.data.repository.CrudRepository;
import ru.postgre.MotoShop.model.Motorcycle;

public interface IMotoRepository extends CrudRepository<Motorcycle, Long>{

}
