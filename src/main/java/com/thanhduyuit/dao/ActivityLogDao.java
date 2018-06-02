package com.thanhduyuit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.thanhduyuit.entities.ActivityLog;

@Transactional
public interface ActivityLogDao extends CrudRepository<ActivityLog, Long>{
	
	@Query("SELECT a FROM ActivityLog a WHERE LOWER(a.goodCode) = LOWER(:code)")
	public List<ActivityLog> getLogByCode(@Param("code") String code);
	
	@Query("SELECT a FROM ActivityLog a WHERE LOWER(a.goodName) = LOWER(:name)")
	public List<ActivityLog> getLogByName(@Param("name") String name);
	
	@Query("SELECT a FROM ActivityLog a WHERE LOWER(a.actionType) = LOWER(:type)")
	public List<ActivityLog> getLogByType( @Param("type") String type);
	
//	@Query("SELECT a FROM ActivityLog a WHERE LOWER(a.actionType) = LOWER(:type)")
//	public List<ActivityLog> getLogByDate( @Param("date") Date date);
	
	@Query("SELECT a FROM ActivityLog a WHERE LOWER(a.goodCode) = LOWER(:code) AND LOWER(a.actionType) = LOWER(:type)")
	public List<ActivityLog> getLogByCodeAndType(@Param("code") String code, @Param("type") String type);
	
	@Query("SELECT a FROM ActivityLog a WHERE LOWER(a.goodName) = LOWER(:name) AND LOWER(a.actionType) = LOWER(:type)")
	public List<ActivityLog> getLogByNameAndType(@Param("name") String name , @Param("type") String type);
	
}
