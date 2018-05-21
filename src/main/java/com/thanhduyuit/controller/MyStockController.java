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
import com.thanhduyuit.response.StockLogResponse;
import com.thanhduyuit.service.ImportService;
import com.thanhduyuit.service.ResponseBuilder;
import com.thanhduyuit.service.StoreLog;

@Controller
@RequestMapping("/mystock")
public class MyStockController {
	
	private static final Log log = LogFactory.getLog(MyStockController.class);

	private static final String X_FORWARDED_FOR = "X-FORWARDED-FOR";

	@Autowired
	private StoreLog storeLogService;

	@Autowired
	private ResponseBuilder responseRuilder;
	
	@RequestMapping("/getalllogs")
	@ResponseBody
	public StockLogResponse getAllGoods(HttpServletRequest request, String stockID) throws Exception {

		// Log client info
		log.info("Reuqest '/getalllogs' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);

		StockLogResponse response = new StockLogResponse();
		response = responseRuilder.getAllActivityLog(storeLogService.getAllStoreActivity());
		return response;
	}

}
