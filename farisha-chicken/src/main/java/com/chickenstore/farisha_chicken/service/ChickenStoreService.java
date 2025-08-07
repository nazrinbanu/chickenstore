package com.chickenstore.farisha_chicken.service;

import com.chickenstore.farisha_chicken.dao.ChickenStoreRepo;
import com.chickenstore.farisha_chicken.dao.CustomerDetailsRepo;
import com.chickenstore.farisha_chicken.entity.*;
import com.chickenstore.farisha_chicken.exception.ChickenException;
import com.chickenstore.farisha_chicken.record.ChickenRec;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChickenStoreService {
	
	private ChickenStoreRepo chickenstorerepo;
	
	//private CustomerDetailsRepo customerdetails;
	
	@Autowired
	public ChickenStoreService(ChickenStoreRepo chickenstorerepo) {
		this.chickenstorerepo=chickenstorerepo;
		
	}

//	
//	@Autowired
//	public ChickenStoreService(CustomerDetailsRepo customerdetails) {
//		super();
//		this.customerdetails = customerdetails;
//	}



	public List<ChickenStore> getAll(){
		return chickenstorerepo.findAll();
	}
	
	public Optional<ChickenStore> getChickenById(int id) {
		return chickenstorerepo.findById(id);
		
	}
	
	@Transactional
	public void addUser(ChickenRec chicken) {
		// TODO Auto-generated method stub
		CustomerDetails customer=new CustomerDetails
				(chicken.customerdetails().name(),
				chicken.customerdetails().email(),
				chicken.customerdetails().phno(),
				chicken.customerdetails().address()
				);
		ChickenStore chickenstore=new ChickenStore(
				chicken.name(),
				chicken.kg(),
				chicken.rs(),customer);
		chickenstorerepo.save(chickenstore);
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
