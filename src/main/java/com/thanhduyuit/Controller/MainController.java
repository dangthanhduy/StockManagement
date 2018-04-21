package com.thanhduyuit.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.GetClientIpInfo;
import com.thanhduyuit.Modal.GoodStandardResponse;
import com.thanhduyuit.Modal.GoodTypeListNameResponse;
import com.thanhduyuit.Modal.GoodTypeResponse;
import com.thanhduyuit.Service.ImportService;
import com.thanhduyuit.Service.ResponseBuilder;

@Controller
public class MainController {

private static final Log log = LogFactory.getLog(ImportController.class);
	
	private static final String X_FORWARDED_FOR  = "X-FORWARDED-FOR";
	
	@Autowired
	private ImportService importer;
	
	@Autowired
	private ResponseBuilder responseRuilder;
	
	@RequestMapping("/getallgoods")
	@ResponseBody
	public GoodStandardResponse getAllGood(HttpServletRequest request, String stockID) throws Exception {
		
		//Log client info
		log.info("------------------Main controller");
		log.info("Reuqest '/getAllGoods' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		log.info("--------------------------------------------------");
		GoodStandardResponse response = new GoodStandardResponse();
		response = responseRuilder.getAllGoodBuilder(importer.getAllGoods());
		return response;
	}
	
	
	@RequestMapping("/getallgoodtypes")
	@ResponseBody
	public GoodTypeResponse getAllGoodType(HttpServletRequest request, String stockID) throws Exception {
		
		//Log client info
		log.info("------------------Main controller");
		log.info("Reuqest '/getallgoodtypes' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		log.info("--------------------------------------------------");
		
		GoodTypeResponse response = new GoodTypeResponse();
		response = responseRuilder.getAllGoodTypeObjectBuilder(importer.getAllGoodType());
		return response;
	}
	
	@RequestMapping("/getallgoodtypeasname")
	@ResponseBody
	public GoodTypeListNameResponse getAllGoodTypeAsName(HttpServletRequest request, String stockID) throws Exception {
		
		//Log client info
		log.info("------------------Main controller");
		log.info("Reuqest '/getallgoodtype' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		log.info("--------------------------------------------------");
		
		GoodTypeListNameResponse response = new GoodTypeListNameResponse();
		response = responseRuilder.getAllGoodTypeAsNameBuilder(importer.getAllGoodType());
		return response;
	}

}
