package ru.postgre.MotoShop.service;

import java.util.ArrayList;

import ru.postgre.MotoShop.model.Motorcycle;

public interface IMotoService {
	public Motorcycle addMotorcycle(Motorcycle moto);
    public Motorcycle updateMotorcycle(Motorcycle moto);
    public ArrayList<Motorcycle> getAllMotorcycle();
    public Motorcycle findMotorcycle(Long id);
    public void deleteMotorcycle(Long id);
}
