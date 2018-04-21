package com.thanhduyuit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.dao.GoodTypeDao;
import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.model.GoodTypeModel;

@Service
public class GoodTypeService {
	
	@Autowired
	private GoodTypeDao goodTypeDao;

	public List<GoodTypeModel> getAllGoodTypeAsName() {
		List<GoodType> listObject = (List<GoodType>) goodTypeDao.findAll();
		List<GoodTypeModel> listResponse = new ArrayList<>();
		for (GoodType p : listObject) {
			GoodTypeModel goodTypeModel = new GoodTypeModel(p.getId(), p.getTypeName());
			listResponse.add(goodTypeModel);
		}
		return listResponse;
	}

}
