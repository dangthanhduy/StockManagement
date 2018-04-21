package com.thanhduyuit.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.thanhduyuit.entities.GoodType;

@Transactional
public interface GoodTypeDao extends CrudRepository<GoodType, Long>{

}
