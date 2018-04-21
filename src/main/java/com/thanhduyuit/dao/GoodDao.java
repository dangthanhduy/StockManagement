package com.thanhduyuit.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.thanhduyuit.entities.Good;



@Transactional
public interface GoodDao extends CrudRepository<Good, Long>{

	
}
