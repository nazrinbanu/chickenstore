package com.chickenstore.farisha.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chickenstore.farisha.entity.Chickenstore;

@Repository
public interface Chickenstorerepo extends JpaRepository<Chickenstore,Integer>{

	void save(Optional<Chickenstore> chicken);

	

}
