package com.thanhduyuit.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.thanhduyuit.entities.ActivityLog;

@Transactional
public interface ActivityLogDao extends CrudRepository<ActivityLog, Long>{

}
