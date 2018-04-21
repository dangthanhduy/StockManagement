package com.thanhduyuit.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhduyuit.controller.ImportController;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.Provider;
import com.thanhduyuit.model.GoodStandardResponse;
import com.thanhduyuit.model.GoodTypeListNameResponse;
import com.thanhduyuit.model.GoodTypeModel;
import com.thanhduyuit.model.GoodTypeResponse;
import com.thanhduyuit.model.MessageResponse;
import com.thanhduyuit.model.ProviderGoodTypeReponse;
import com.thanhduyuit.model.ProviderModel;
import com.thanhduyuit.model.ProviderResponse;

@Service
public class ResponseBuilder {
	private static final Log log = LogFactory.getLog(ImportController.class);

	@Autowired
	private ProviderService providerService;
	
	@Autowired
	private GoodTypeService goodTypeService;

	public MessageResponse createGoodBuilder(String contents) {
		MessageResponse response = new MessageResponse();
		if (contents == null) {
			response.setStatuscode(500);
			response.setMessage("Cannot get list goods...!");
			return response;
		} else {
			response.setStatuscode(200);
			response.setMessage("Success");
			return response;
		}

	}

	public GoodStandardResponse getAllGoodBuilder(List<Good> listGood) {
		GoodStandardResponse response = new GoodStandardResponse();
		if (listGood == null) {
			log.info("listGood is null");
			response.setStatuscode(500);
			response.setMessage("Cannot get list goods...!");
			return response;
		} else {
			response.setStatuscode(200);
			response.setMessage("Success");
			response.setListgoods(listGood);
			log.info("Get ListGoods Success !!!");
			return response;
		}

	}

	public GoodTypeResponse getAllGoodTypeObjectBuilder(List<GoodType> listGoodType) {
		GoodTypeResponse response = new GoodTypeResponse();
		if (listGoodType == null) {
			log.info("listGoodType is null");
			response.setStatuscode(500);
			response.setMessage("Cannot get list goods...!");
			return response;
		} else {
			response.setStatuscode(200);
			response.setMessage("Success");
			response.setListGoodType(listGoodType);
			log.info("Get list GoodType Success !!!");
			return response;
		}

	}

	public GoodTypeListNameResponse getAllGoodTypeAsNameBuilder(List<GoodType> listGoodType) {
		GoodTypeListNameResponse response = new GoodTypeListNameResponse();
		Map<Long, String> listGoodTypeIdName = new HashMap<>();

		for (GoodType goodType : listGoodType) {
			listGoodTypeIdName.put(goodType.getId(), goodType.getTypeName());
		}

		if (listGoodType == null) {
			log.info("listGoodType is null");
			response.setStatuscode(500);
			response.setMessage("Cannot get list goods...!");
			return response;
		} else {
			response.setStatuscode(200);
			response.setMessage("Success");
			response.setListGoodTypeName(listGoodTypeIdName);
			log.info("Get All GoodType As Name and ID Success !!!");
			return response;
		}

	}

//	public ProviderResponse getAllProvider() {
//		ProviderResponse response = new ProviderResponse();
//		Map<Long, String> listProvider = new HashMap<>();
//		
//		for (GoodType goodType : listGoodType) {
//			listGoodTypeIdName.put(goodType.getId(), goodType.getTypeName());
//		}
//		listProvider = providerService.g();
//
//		if (listProvider == null) {
//			log.info("listGoodType is null");
//			response.setStatuscode(500);
//			response.setMessage("Cannot get list provider...!");
//			return response;
//		} else {
//			response.setStatuscode(200);
//			response.setMessage("Success");
//			response.setListProviderName(listProvider);
//			log.info("Get All provider As Name and ID Success !!!");
//			return response;
//		}
//	}
	
	public ProviderGoodTypeReponse getAllProviderAndGoodType() {
		ProviderGoodTypeReponse response = new ProviderGoodTypeReponse();
		List<ProviderModel> listProvider = new ArrayList<>();
		List<GoodTypeModel> listGoodType = new ArrayList<>();
		listProvider = providerService.getAllProviderAsName();
		listGoodType = goodTypeService.getAllGoodTypeAsName();

		if (listProvider == null) {
			log.info("listGoodType is null");
			response.setStatuscode(500);
			response.setMessage("Cannot get list provider...!");
			return response;
		} else {
			response.setStatuscode(200);
			response.setMessage("Success");
			response.setListProviderName(listProvider);
			response.setListGoodTypeName(listGoodType);
			log.info("Get All provider As Name and ID Success !!!");
			return response;
		}
	}

}
