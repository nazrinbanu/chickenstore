package com.chickenstore.farisha.dao;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.chickenstore.farisha.entity.ChickenStore;

//@Repository
public interface ChickenStoreRepo extends JpaRepository<ChickenStore,Integer>{

	void save(Optional<ChickenStore> chicken);

	

}
