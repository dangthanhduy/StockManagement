package com.thanhduyuit.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.thanhduyuit.entities.Good;

@Transactional
public interface GoodDao extends CrudRepository<Good, Long> {

	@Query("SELECT a FROM Good a WHERE LOWER(a.code) = LOWER(:goodCode)")
	public Good getGoodByCode(@Param("goodCode") String goodCode);
}
