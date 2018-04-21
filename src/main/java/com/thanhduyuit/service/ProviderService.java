package com.thanhduyuit.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.dao.ProviderDao;
import com.thanhduyuit.entities.Provider;
import com.thanhduyuit.model.ProviderModel;

@Service
public class ProviderService {

	@Autowired
	private ProviderDao providerDao;

	public List<ProviderModel> getAllProviderAsName() {
		List<Provider> listObject = (List<Provider>) providerDao.findAll();
		List<ProviderModel> listResponse = new ArrayList<>();
		for (Provider p : listObject) {
			ProviderModel providerModel = new ProviderModel(p.getId(), p.getProviderName());
			listResponse.add(providerModel);
		}
		return listResponse;
	}

}
