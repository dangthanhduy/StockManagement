package com.thanhduyuit.controller;


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
import com.thanhduyuit.model.GoodModelImport;
import com.thanhduyuit.model.GoodResponse;
import com.thanhduyuit.model.GoodTypeModelCreate;
import com.thanhduyuit.model.ProviderModelCreate;
import com.thanhduyuit.model.UnitModelCreate;
import com.thanhduyuit.response.CreateGoodResponse;
import com.thanhduyuit.response.CreateGoodTypeResponse;
import com.thanhduyuit.response.CreateProviderResponse;
import com.thanhduyuit.response.CreateUnitResponse;
import com.thanhduyuit.response.GoodStandardResponse;
import com.thanhduyuit.response.ImportGoodResponse;
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

	@RequestMapping("/getallgoods")
	@ResponseBody
	public GoodStandardResponse getAllGoods(HttpServletRequest request, String stockID) throws Exception {

		// Log client info
		log.info("Reuqest '/getallgoods' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return responseRuilder.getAllGoodBuilder(importer.getAllGoodResponse());
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
	
	@RequestMapping(value = "/updategood", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public CreateGoodResponse updateNewGood(HttpServletRequest request, @RequestBody GoodModelCreate data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/createnewgood' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return importer.updateNewGood(data);
	}
	
	@RequestMapping(value = "/createnewgoodtype", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public CreateGoodTypeResponse createNewGoodType(HttpServletRequest request, @RequestBody GoodTypeModelCreate data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/createnewgoodtype' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return importer.createGoodType(data);
	}
	
	@RequestMapping(value = "/createnewprovider", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public CreateProviderResponse createNewProvider(HttpServletRequest request, @RequestBody ProviderModelCreate data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/createnewprovider' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return importer.createNewProvider(data);
	}
	
	@RequestMapping(value = "/createnewunit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public CreateUnitResponse createUnit(HttpServletRequest request, @RequestBody UnitModelCreate data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/createnewunit' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return importer.createNewUnit(data);
	}
	
	
	@RequestMapping(value = "/importgood", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ImportGoodResponse importGoodQuantity(HttpServletRequest request, @RequestBody GoodModelImport data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/importgood' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return importer.importGood(data);
	}

}
