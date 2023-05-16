package ru.postgre.MotoShop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.postgre.MotoShop.model.Motorcycle;
import ru.postgre.MotoShop.repository.IMotoRepository;

@Service
public class MotoService implements IMotoService{
	
	@Autowired
	private IMotoRepository motoRepository;

	@Override
	public Motorcycle addMotorcycle(Motorcycle moto) {		
		//if (moto.getModel() != null && moto.getBrand() != null && moto.getPower() != null && moto.getPrice() != null) {
		try {			
			return motoRepository.save(moto);
			//return "Object has been saved";
		}catch (Exception e) {
			//return "Object has not been saved";
			return null;
		}		
	}

	@Override
	public Motorcycle updateMotorcycle(Motorcycle moto) {
		try {
			return motoRepository.save(moto);			
		}catch (Exception e) {			
			return null;
		}
	}

	@Override
	public ArrayList<Motorcycle> getAllMotorcycle() {		
		return (ArrayList<Motorcycle>) motoRepository.findAll();
	}

	@Override
	public Motorcycle findMotorcycle(Long id) {
		return motoRepository.findById(id).orElse(null);		
	}

	@Override
	public void deleteMotorcycle(Long id) {
		motoRepository.deleteById(id);		
	}	
}
