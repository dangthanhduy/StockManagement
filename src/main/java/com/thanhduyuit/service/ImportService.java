package com.thanhduyuit.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.controller.ImportController;
import com.thanhduyuit.dao.GoodDao;
import com.thanhduyuit.dao.GoodTypeDao;
import com.thanhduyuit.dao.ProviderDao;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.Provider;
import com.thanhduyuit.model.GoodModelCreate;
import com.thanhduyuit.model.GoodTypeModelCreate;
import com.thanhduyuit.response.CreateGoodResponse;

@Service
public class ImportService {
	
	private static final Log log = LogFactory.getLog(ImportController.class);

	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private GoodTypeDao goodTypeDao;
	
	@Autowired
	private ProviderDao providerDao;

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
	
	public CreateGoodResponse createNewGood(GoodModelCreate data) {
		CreateGoodResponse response  = new CreateGoodResponse();
		try {
		Provider provider = providerDao.findOne(Long.valueOf(data.getProviderID()));
		GoodType goodtype = goodTypeDao.findOne(Long.valueOf(data.getType()));
		Good good = new Good(data.getName(), data.getCode(), goodtype.getTypeName(), data.getUnit(), data.getImagePath(), 0,
				Double.valueOf(data.getImportPrice()), Double.valueOf(data.getExportPrice()), goodtype, provider);
		goodDao.save(good);
		
		response.setStatuscode(200);
		response.setMessage("Create good successfull");
		response.setGoodID(good.getId());
		log.info("Create good successfull with goodID : " + good.getId());
		} catch (Exception e) {
			response.setStatuscode(500);
			response.setMessage("Create good failed" + e);
			response.setGoodID(0L);
			log.info("Create good failed");
		}
		return response;
	}
	
	public String createGoodType(GoodTypeModelCreate data) {
		
		GoodType goodtype = new GoodType(data.getTypeName(), data.getCode(), data.getDescription());
		goodTypeDao.save(goodtype);
		
		return goodtype.getTypeName();
	}

}
