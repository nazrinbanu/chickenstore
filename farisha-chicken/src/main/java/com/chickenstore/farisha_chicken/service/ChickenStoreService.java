package com.chickenstore.farisha_chicken.service;

import com.chickenstore.farisha_chicken.dao.ChickenStoreRepo;
import com.chickenstore.farisha_chicken.entity.*;
import com.chickenstore.farisha_chicken.exception.ChickenException;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChickenStoreService {
	
	private ChickenStoreRepo chickenstorerepo;
	
	@Autowired
	public ChickenStoreService(ChickenStoreRepo chickenstorerepo) {
		this.chickenstorerepo=chickenstorerepo;
		
	}

	
	public List<ChickenStore> getAll(){
		return chickenstorerepo.findAll();
	}
	
	public Optional<ChickenStore> getChickenById(int id) {
		return chickenstorerepo.findById(id);
		
	}
	
	@Transactional
	public void addUser(ChickenStore chicken) {
		// TODO Auto-generated method stub
		chickenstorerepo.save(chicken);
	}


	@Transactional
	public void updateDetails(int id, int kg) {
		// TODO Auto-generated method stub
		Boolean exist=chickenstorerepo.existsById(id);
		if(exist) {
			Optional<ChickenStore>chicken=chickenstorerepo.findById(id);
			chicken.get().setKg(kg);
		}
	}


	public void removeUserDetails(int id) {
		// TODO Auto-generated method stub
		chickenstorerepo.deleteById(id);
	}


	public ChickenStore getUserById(int id) {
		// TODO Auto-generated method stub
		ChickenStore chicken=chickenstorerepo.findChickenById(id);
		if( chicken==null) {
			throw new ChickenException("User not found : "+id);
		}
	return chicken;
		
	}
}
