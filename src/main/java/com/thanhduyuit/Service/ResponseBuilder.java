package com.thanhduyuit.Service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.thanhduyuit.Controller.ImportController;
import com.thanhduyuit.Modal.GoodStandardResponse;
import com.thanhduyuit.Modal.MessageResponse;
import com.thanhduyuit.entities.Good;

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
	
	public GoodStandardResponse getAllGood(List<Good> listGood) {
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
	
	

}
