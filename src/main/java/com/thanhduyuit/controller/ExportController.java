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
import com.thanhduyuit.model.GoodModelExport;
import com.thanhduyuit.response.ExportGoodResponse;
import com.thanhduyuit.response.GoodStandardResponse;
import com.thanhduyuit.service.ExportService;
import com.thanhduyuit.service.ImportService;
import com.thanhduyuit.service.ResponseBuilder;

@Controller
@RequestMapping("/export")
public class ExportController {

	private static final Log log = LogFactory.getLog(ExportController.class);

	private static final String X_FORWARDED_FOR = "X-FORWARDED-FOR";

	@Autowired
	private ImportService importer;

	@Autowired
	private ExportService exporter;

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

	@RequestMapping(value = "/exportgood", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ExportGoodResponse importGoodQuantity(HttpServletRequest request, @RequestBody GoodModelExport data)
			throws Exception {

		// Log client info
		log.info("Reuqest '/exportgood' is calling from client with IP : " + request.getHeader(X_FORWARDED_FOR));
		GetClientIpInfo.getClientInfo(request);
		return exporter.exportGood(data);
	}

}
