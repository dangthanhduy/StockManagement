package com.thanhduyuit.Controller;

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
import com.thanhduyuit.Modal.GoodStandardResponse;
import com.thanhduyuit.Service.ImportService;
import com.thanhduyuit.Service.ResponseBuilder;

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
		log.info("Reuqest '/getAllGoods' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		
		GoodStandardResponse response = new GoodStandardResponse();
		response = responseRuilder.getAllGoodBuilder(importer.getAllGoods());
		return response;
	}

}
