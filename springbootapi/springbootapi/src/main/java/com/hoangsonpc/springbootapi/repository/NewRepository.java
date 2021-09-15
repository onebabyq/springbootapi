package com.hoangsonpc.springbootapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hoangsonpc.springbootapi.entity.NewEntity;

@Repository
public interface NewRepository extends CrudRepository<NewEntity, Long>{
	List<NewEntity> findAll();

	NewEntity findById(long id);
	
	void deleteById(long id);
	
	
}
