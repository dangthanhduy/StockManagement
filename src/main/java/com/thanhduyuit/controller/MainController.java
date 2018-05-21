package com.thanhduyuit.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.GetClientIpInfo;
import com.thanhduyuit.response.GoodStandardResponse;
import com.thanhduyuit.response.GoodTypeListNameResponse;
import com.thanhduyuit.response.GoodTypeResponse;
import com.thanhduyuit.response.ProviderGoodTypeReponse;
import com.thanhduyuit.response.ProviderResponse;
import com.thanhduyuit.service.ImportService;
import com.thanhduyuit.service.ResponseBuilder;

@Controller
public class MainController {

private static final Log log = LogFactory.getLog(MainController.class);
	
	private static final String X_FORWARDED_FOR  = "X-FORWARDED-FOR";
	
	@Autowired
	private ImportService importer;
	
	@Autowired
	private ResponseBuilder responseRuilder;
	
	@RequestMapping("/getallgoodtypes")
	@ResponseBody
	public GoodTypeResponse getAllGoodType(HttpServletRequest request, String stockID) throws Exception {
		//Log client info
		log.info("------------------Main controller");
		log.info("Reuqest '/getallgoodtypes' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		log.info("--------------------------------------------------");
		return responseRuilder.getAllGoodTypeObjectBuilder(importer.getAllGoodType());
	}
	
	@RequestMapping("/getallgoodtypeasname")
	@ResponseBody
	public GoodTypeListNameResponse getAllGoodTypeAsName(HttpServletRequest request, String stockID) throws Exception {
		//Log client info
		log.info("------------------Main controller");
		log.info("Reuqest '/getallgoodtype' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		log.info("--------------------------------------------------");
		
		return responseRuilder.getAllGoodTypeAsNameBuilder(importer.getAllGoodType());
	}
	
//	@RequestMapping("/getallprovier")
//	@ResponseBody
//	public ProviderResponse getAllProvider(HttpServletRequest request, String stockID) throws Exception {
//		//Log client info
//		log.info("------------------Main controller");
//		log.info("Reuqest '/getallprovier' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
//		GetClientIpInfo.getClientInfo(request);
//		log.info("--------------------------------------------------");
//		return responseRuilder.getAllProvider();
//	}
	
	@RequestMapping("/loadprovidergoodtype")
	@ResponseBody
	public ProviderGoodTypeReponse prepareProviderAndGoodType(HttpServletRequest request, String stockID) throws Exception {
		//Log client info
		log.info("------------------Main controller");
		log.info("Reuqest '/loadprovidergoodtype' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		log.info("--------------------------------------------------");
		return responseRuilder.getAllProviderAndGoodType();
	}
	
	

}
