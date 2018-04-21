package com.thanhduyuit.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.GetClientIpInfo;
import com.thanhduyuit.model.GoodModelCreate;
import com.thanhduyuit.model.GoodStandardResponse;
import com.thanhduyuit.service.ImportService;
import com.thanhduyuit.service.ResponseBuilder;

@Controller
@RequestMapping("/import")
public class ImportController {
	
	private static final Log log = LogFactory.getLog(ImportController.class);
	
	private static final String X_FORWARDED_FOR  = "X-FORWARDED-FOR";
	
	@Autowired
	private ImportService importer;
	
	@Autowired
	private ResponseBuilder responseRuilder;
	
	@RequestMapping("/getallgood")
	@ResponseBody
	public GoodStandardResponse getAllGood(HttpServletRequest request, String stockID) throws Exception {
		
		//Log client info
		log.info("Reuqest '/getallgood' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		
		GoodStandardResponse response = new GoodStandardResponse();
		response = responseRuilder.getAllGoodBuilder(importer.getAllGoods());
		return response;
	}
	
	@RequestMapping("/createnewgood")
	@ResponseBody
	public GoodStandardResponse createNewGood(HttpServletRequest request, GoodModelCreate goodModal) throws Exception {
		
		//Log client info
		log.info("Reuqest '/createnewgood' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		
		GoodStandardResponse response = new GoodStandardResponse();
		response = responseRuilder.getAllGoodBuilder(importer.getAllGoods());
		return response;
	}

}
