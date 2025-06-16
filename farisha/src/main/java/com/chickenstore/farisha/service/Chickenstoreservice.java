package com.chickenstore.farisha.service;

import com.chickenstore.farisha.dao.Chickenstorerepo;
import com.chickenstore.farisha.entity.*;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Chickenstoreservice {
	
	private Chickenstorerepo chickenstorerepo;
	
	@Autowired
	public Chickenstoreservice(Chickenstorerepo chickenstorerepo) {
		this.chickenstorerepo=chickenstorerepo;
		
	}

	
	public List<Chickenstore> getAll(){
		return chickenstorerepo.findAll();
	}
	
	public Optional<Chickenstore> getChickenById(int id) {
		return chickenstorerepo.findById(id);
		
	}
	
	@Transactional
	public void addUser(Chickenstore chicken) {
		// TODO Auto-generated method stub
		chickenstorerepo.save(chicken);
	}


	@Transactional
	public void updateDetails(int id, int kg) {
		// TODO Auto-generated method stub
		Boolean exist=chickenstorerepo.existsById(id);
		if(exist) {
			Optional<Chickenstore>chicken=chickenstorerepo.findById(id);
			chicken.get().setKg(kg);
		}
	}


	public void removeUserDetails(int id) {
		// TODO Auto-generated method stub
		chickenstorerepo.deleteById(id);
	}
}
