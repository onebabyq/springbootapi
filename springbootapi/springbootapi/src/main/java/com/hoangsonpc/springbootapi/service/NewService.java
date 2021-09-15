package com.hoangsonpc.springbootapi.service;

import java.util.List;

import com.hoangsonpc.springbootapi.entity.NewEntity;

public interface NewService {
	List<NewEntity> findAll();
	NewEntity findById(long id);
	NewEntity save(NewEntity newEntity);
	void deleteById(long id);
}
