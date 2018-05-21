package com.thanhduyuit.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.dao.GoodDao;
import com.thanhduyuit.dao.GoodTypeDao;
import com.thanhduyuit.dao.ActivityLogDao;
import com.thanhduyuit.dao.ProviderDao;
import com.thanhduyuit.dao.UnitDao;
import com.thanhduyuit.entities.ActivityLog;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.model.ActivityLogModel;
import com.thanhduyuit.model.GoodModelExport;
import com.thanhduyuit.model.GoodModelImport;
import com.thanhduyuit.model.GoodResponse;

import Ultilities.Converter;

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

}
