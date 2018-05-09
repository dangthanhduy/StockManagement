package com.thanhduyuit.response;

import java.util.Map;

public class ProviderResponse  extends MessageResponse  {

	private Map<Long, String> listProviderName;

	public Map<Long, String> getListProviderName() {
		return listProviderName;
	}

	public void setListProviderName(Map<Long, String> listProviderName) {
		this.listProviderName = listProviderName;
	}

	public ProviderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProviderResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public ProviderResponse(String message, long statuscode, Map<Long, String> listProviderName) {
		super(message, statuscode);
		this.listProviderName = listProviderName;
	}
	
	
}
