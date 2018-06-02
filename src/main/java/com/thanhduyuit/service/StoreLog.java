package com.thanhduyuit.service;

import java.util.Date;
import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.dao.ActivityLogDao;
import com.thanhduyuit.entities.ActivityLog;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.model.ActivityLogModel;
import com.thanhduyuit.model.FilterModel;
import com.thanhduyuit.model.GoodModelExport;
import com.thanhduyuit.model.GoodModelImport;

import Ultilities.Converter;
import Ultilities.DateUtil;

@Service
public class StoreLog {

	private static final Log log = LogFactory.getLog(StoreLog.class);

	@Autowired
	private ActivityLogDao logDao;

	public void storeImportLog(GoodModelImport data, Good goodUpdated, double quantityChange) {
		// ActivityLog log = new ActivityLog();
		Date today = new Date();
		ActivityLog log = new ActivityLog(today, "IMPORT", goodUpdated.getName(), goodUpdated.getCode(),
				data.getImportPrice(), goodUpdated.getExportPrice(), quantityChange,
				goodUpdated.getProvider().getProviderName(), "-");
		logDao.save(log);
	}

	public void storeExportLog(GoodModelExport data, Good goodUpdated) {
		// ActivityLog log = new ActivityLog();
		Date today = new Date();
		ActivityLog log = new ActivityLog(today, "EXPORT", goodUpdated.getName(), goodUpdated.getCode(),
				goodUpdated.getImportPrice(), data.getExportPrice(), data.getQuantity(),
				goodUpdated.getProvider().getProviderName(), data.getCustomerName());
		logDao.save(log);
	}

	public List<ActivityLogModel> getAllStoreActivity() {
		List<ActivityLog> listEntities = (List<ActivityLog>) logDao.findAll();
		List<ActivityLogModel> response = Converter.activityLogEntitytoModel(listEntities);
		return response;
	}

	public List<ActivityLogModel> filterStoreActivity(FilterModel filterModel) {
		List<ActivityLog> listEntities = (List<ActivityLog>) logDao.findAll();
		
		String codeParam = filterModel.getCode();
		String nameParam = filterModel.getName();
		String typeParam = filterModel.getType();
		Date fromDateParam = filterModel.getFromDate();
		Date toDateParam = filterModel.getToDate();

		if (codeParam != null && !codeParam.isEmpty()) {
			 log.info("Filter with CODE");
			 listEntities.removeIf(b -> !b.getGoodCode().equalsIgnoreCase(codeParam));
		}
		if (nameParam != null && !nameParam.isEmpty() && codeParam == null  || codeParam.isEmpty()) {
			 log.info("Filter with NAME");
			 listEntities.removeIf(b -> !b.getGoodName().equalsIgnoreCase(nameParam));
		}
		if (typeParam != null && !typeParam.isEmpty() && !typeParam.equalsIgnoreCase("ALL")) {
			listEntities.removeIf(b -> !b.getActionType().equalsIgnoreCase(typeParam));
		}
		if (fromDateParam != null) {
			 log.info("Filter with fromDateParam");
			 listEntities.removeIf(b -> b.getDate().before(fromDateParam));
		}
		if (toDateParam != null) {
			 log.info("Filter with toDateParam");
			 Date toDateParamNext = DateUtil.addDays(toDateParam, 1);
			 listEntities.removeIf(b -> b.getDate().after(toDateParamNext));
		}
		
		List<ActivityLogModel> listAllModels = Converter.activityLogEntitytoModel(listEntities);
		
		return listAllModels;
	}

}
