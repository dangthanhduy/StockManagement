package com.thanhduyuit.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.Provider;

@Transactional
public interface ProviderDao extends CrudRepository<Provider, Long>{

}
