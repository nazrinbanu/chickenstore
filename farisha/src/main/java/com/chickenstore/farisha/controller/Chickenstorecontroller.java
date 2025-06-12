package com.chickenstore.farisha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chickenstore.farisha.entity.Chickenstore;
import com.chickenstore.farisha.service.Chickenstoreservice;

@RestController
@RequestMapping("/chicken")
public class Chickenstorecontroller {
	
	private Chickenstoreservice service;

	@Autowired
	public Chickenstorecontroller(Chickenstoreservice service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/item")
	public List<Chickenstore> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/item")
	public void addUserDetails(@RequestBody Chickenstore chicken) {
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
