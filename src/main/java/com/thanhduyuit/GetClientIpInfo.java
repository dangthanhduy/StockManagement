package com.thanhduyuit;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.thanhduyuit.Controller.ImportController;

public class GetClientIpInfo {
	private static final Log log = LogFactory.getLog(ImportController.class);

	public static void getClientInfo(HttpServletRequest request) {
		Enumeration headerNames = request.getHeaderNames();
		Map<String, String> result = new HashMap<>();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			result.put(key, value);
		}
		log.info("Enumeration : " + result);
	}

}
