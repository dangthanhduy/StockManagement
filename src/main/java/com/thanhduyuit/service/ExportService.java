package com.thanhduyuit.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.controller.ImportController;
import com.thanhduyuit.dao.GoodDao;
import com.thanhduyuit.dao.GoodTypeDao;
import com.thanhduyuit.dao.ProviderDao;
import com.thanhduyuit.dao.UnitDao;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.model.GoodModelExport;
import com.thanhduyuit.model.GoodModelImport;
import com.thanhduyuit.response.ExportGoodResponse;
import com.thanhduyuit.response.ImportGoodResponse;

@Service
public class ExportService {
	
	private static final Log log = LogFactory.getLog(ExportService.class);

	@Autowired
	private GoodDao goodDao;

	@Autowired
	private GoodTypeDao goodTypeDao;

	@Autowired
	private ProviderDao providerDao;

	@Autowired
	private UnitDao unitrDao;

	@Autowired
	private ResponseBuilder responseRuilder;
	
	@Autowired
	private StoreLog storeLog;
	
	public ExportGoodResponse exportGood(GoodModelExport data) {
		Good goodNeedToUpdate = goodDao.getGoodByCode(data.getCode());
		double quantityAfterChange = goodNeedToUpdate.getQuantity() - data.getQuantity();
		if (quantityAfterChange > 0) {
			goodNeedToUpdate.setExportPrice(data.getExportPrice());
			goodNeedToUpdate.setQuantity(quantityAfterChange);
			goodDao.save(goodNeedToUpdate);
			storeLog.storeExportLog(data, goodNeedToUpdate);
		}
		return responseRuilder.exportGoodBuilder(quantityAfterChange);
	} 

}
