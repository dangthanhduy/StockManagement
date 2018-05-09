package com.thanhduyuit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.dao.UnitDao;
import com.thanhduyuit.entities.Unit;
import com.thanhduyuit.model.UnitTypeModel;

@Service
public class UnitService {
	
	@Autowired
	private UnitDao unitDao;
	
	public List<UnitTypeModel> getAllUnitList() {
		List<Unit> listEntity = (List<Unit>) unitDao.findAll();
		List<UnitTypeModel> response = new ArrayList<>();
		for (Unit unit : listEntity) {
			UnitTypeModel model = new UnitTypeModel(unit.getId(), unit.getUnit());
			response.add(model);
		}
		
		return response;
	}

}
