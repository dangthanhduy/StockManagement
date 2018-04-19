package com.thanhduyuit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.DAO.GoodDao;
import com.thanhduyuit.entities.Good;

@Service
public class ImportService {

	@Autowired
	private GoodDao goodDao;

	public List<Good> createGood(String name, String code, String type, String unit, String imagePath, double quantity,
			String importPrice, String exportPrice, String goodTypeID, String providerID) throws Exception {
		return (List<Good>) goodDao.findAll();
	}
	
	public List<Good> getAllGoods() throws Exception {
		return (List<Good>) goodDao.findAll();
	}

}
