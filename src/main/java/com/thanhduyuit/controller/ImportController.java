package com.thanhduyuit.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.GetClientIpInfo;
import com.thanhduyuit.model.GoodModelCreate;
import com.thanhduyuit.model.GoodTypeModelCreate;
import com.thanhduyuit.response.CreateGoodResponse;
import com.thanhduyuit.response.GoodStandardResponse;
import com.thanhduyuit.service.ImportService;
import com.thanhduyuit.service.ResponseBuilder;

@Controller
@RequestMapping("/import")
public class ImportController {

	private static final Log log = LogFactory.getLog(ImportController.class);

	private static final String X_FORWARDED_FOR = "X-FORWARDED-FOR";

	@Autowired
	private ImportService importer;

	@Autowired
	private ResponseBuilder responseRuilder;

	@RequestMapping("/getallgood")
	@ResponseBody
	public GoodStandardResponse getAllGood(HttpServletRequest request, @RequestBody String stockID) throws Exception {

		// Log client info
		log.info("Reuqest '/getallgood' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);

		GoodStandardResponse response = new GoodStandardResponse();
		response = responseRuilder.getAllGoodBuilder(importer.getAllGoods());
		return response;
	}

	@RequestMapping(value = "/createnewgood", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public CreateGoodResponse createNewGood(HttpServletRequest request, @RequestBody GoodModelCreate data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/createnewgood' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return importer.createNewGood(data);
	}
	
	@RequestMapping(value = "/createnewgoodtype", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String createNewGoodType(HttpServletRequest request, @RequestBody GoodTypeModelCreate data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/createnewgoodtype' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return importer.createGoodType(data);
	}

}
