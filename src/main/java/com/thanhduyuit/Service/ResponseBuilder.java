package com.thanhduyuit.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.thanhduyuit.Controller.ImportController;
import com.thanhduyuit.Modal.GoodStandardResponse;
import com.thanhduyuit.Modal.GoodTypeListNameResponse;
import com.thanhduyuit.Modal.GoodTypeResponse;
import com.thanhduyuit.Modal.MessageResponse;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;

@Service
public class ResponseBuilder {
	private static final Log log = LogFactory.getLog(ImportController.class);

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
			log.info("Set ListGoods Success !!!");
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
			log.info("Set list GoodType Success !!!");
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
			log.info("Set get All GoodType As Name and ID Success !!!");
			return response;
		}

	}

}
