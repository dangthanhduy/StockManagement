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
import com.thanhduyuit.entities.Unit;
import com.thanhduyuit.model.GoodResponse;
import com.thanhduyuit.model.GoodTypeModel;
import com.thanhduyuit.model.GoodTypeModelCreate;
import com.thanhduyuit.model.ProviderModel;
import com.thanhduyuit.model.ProviderModelCreate;
import com.thanhduyuit.model.UnitModelCreate;
import com.thanhduyuit.model.UnitTypeModel;
import com.thanhduyuit.response.CreateGoodTypeResponse;
import com.thanhduyuit.response.CreateProviderResponse;
import com.thanhduyuit.response.CreateUnitResponse;
import com.thanhduyuit.response.GoodStandardResponse;
import com.thanhduyuit.response.GoodTypeListNameResponse;
import com.thanhduyuit.response.GoodTypeResponse;
import com.thanhduyuit.response.MessageResponse;
import com.thanhduyuit.response.ProviderGoodTypeReponse;

import Ultilities.Converter;
import Ultilities.MessageConstants;

@Service
public class ResponseBuilder {
	private static final Log log = LogFactory.getLog(ImportController.class);

	@Autowired
	private ProviderService providerService;
	
	@Autowired
	private GoodTypeService goodTypeService;
	
	@Autowired
	private UnitService unitService;
	
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

	public GoodStandardResponse getAllGoodBuilder(List<GoodResponse> listGood) {
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
	
//	public GoodStandardResponse getAllGoodBuilder2(List<Good> listGood) {
//		GoodStandardResponse response = new GoodStandardResponse();
//		if (listGood == null) {
//			log.info("listGood is null");
//			response.setStatuscode(500);
//			response.setMessage("Cannot get list goods...!");
//			return response;
//		} else {
//			response.setStatuscode(200);
//			response.setMessage("Success");
//			response.setListgoods(listGood);
//			log.info("Get ListGoods Success !!!");
//			return response;
//		}
//
//	}

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
		List<UnitTypeModel> listUnitType = new ArrayList<>();
		listProvider = providerService.getAllProviderAsName();
		listGoodType = goodTypeService.getAllGoodTypeAsName();
		listUnitType = unitService.getAllUnitList();
		
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
			response.setListUnitType(listUnitType);
			log.info("Get All provider As Name and ID Success !!!");
			return response;
		}
	}
	
	public CreateGoodTypeResponse createGoodTypeBuilder(GoodType goodtype) {
		CreateGoodTypeResponse response = new CreateGoodTypeResponse();
		if(goodtype != null) {
			GoodTypeModelCreate model = Converter.goodTypeToModelCreate(goodtype);
			response.setGoodTypeModel(model);
			response.setGoodTypeID(goodtype.getId());
			response.setMessage(MessageConstants.CREATE_GOODTYPE_SUCCESSFUL_MESSAGE + goodtype.getId());
			response.setStatuscode(MessageConstants.SUCCESSFULL_STATUS_CODE);
			return response;
		} else {
			response.setMessage(MessageConstants.CREATE_GOODTYPE_FAILED_MESSAGE);
			response.setStatuscode(MessageConstants.FAILED_STATUS_CODE);
			return response;
		}
	}
	
	public CreateProviderResponse createProviderBuilder(Provider provider) {
		CreateProviderResponse response = new CreateProviderResponse();
		if(provider != null) {
			ProviderModelCreate model = Converter.providerToModelCreate(provider);
			response.setProviderModel(model);
			response.setProviderID(provider.getId());
			response.setMessage(MessageConstants.CREATE_PROVIDER_SUCCESSFUL_MESSAGE + provider.getId());
			response.setStatuscode(MessageConstants.SUCCESSFULL_STATUS_CODE);
			return response;
		} else {
			response.setMessage(MessageConstants.CREATE_PROVIDER_FAILED_MESSAGE);
			response.setStatuscode(MessageConstants.FAILED_STATUS_CODE);
			return response;
		}
	}
	
	public CreateUnitResponse createUnitBuilder(Unit unit) {
		CreateUnitResponse response = new CreateUnitResponse();
		if(unit != null) {
			UnitModelCreate model = Converter.unitToModelCreate(unit);
			response.setUnitID(unit.getId());
			response.setUnitModel(model);
			response.setMessage(MessageConstants.CREATE_PROVIDER_SUCCESSFUL_MESSAGE + unit.getId());
			response.setStatuscode(MessageConstants.SUCCESSFULL_STATUS_CODE);
			return response;
		} else {
			response.setMessage(MessageConstants.CREATE_PROVIDER_FAILED_MESSAGE);
			response.setStatuscode(MessageConstants.FAILED_STATUS_CODE);
			return response;
		}
	}

}
