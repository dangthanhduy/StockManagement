package com.thanhduyuit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.dao.GoodDao;
import com.thanhduyuit.dao.GoodTypeDao;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;

@Service
public class ImportService {

	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private GoodTypeDao goodTypeDao;

	public List<Good> createGood(String name, String code, String type, String unit, String imagePath, double quantity,
			String importPrice, String exportPrice, String goodTypeID, String providerID) throws Exception {
		return (List<Good>) goodDao.findAll();
	}
	
	public List<Good> getAllGoods() throws Exception {
		return (List<Good>) goodDao.findAll();
	}
	
	public List<GoodType> getAllGoodType() throws Exception {
		return (List<GoodType>) goodTypeDao.findAll();
	}

}
