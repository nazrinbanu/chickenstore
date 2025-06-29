package com.chickenstore.farisha_chicken.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chickenstore.farisha_chicken.entity.ChickenStore;
import com.chickenstore.farisha_chicken.service.ChickenStoreService;

@RestController
@RequestMapping("/chicken")
public class ChickenStoreController {
	
	private ChickenStoreService service;

	@Autowired
	public ChickenStoreController(ChickenStoreService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/item")
	public List<ChickenStore> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/item/{id}")
	public ChickenStore getSingleUser(@PathVariable int id){
		return service.getUserById(id);
	}
	
	@PostMapping("/item")
	public void addUserDetails(@RequestBody ChickenStore chicken) {
		service.addUser(chicken);
	}
	
	@PutMapping("/item/{id}")
	public void updateuserDetails(@PathVariable("id") int id,@RequestParam() int kg) {
		service.updateDetails(id,kg);
	}
	
	@DeleteMapping("/item/{id}")
	public void removeUserDetails(@PathVariable("id")int id) {
		service.removeUserDetails(id);
	}

}
